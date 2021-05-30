package com.world_of_anonymous.core_java.journaldev;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class UTFRandomFileLineReader {
  private final Charset charset = Charset.forName("utf-8");
  private CyclicBuffer buffer;
  private ByteBuffer temp = ByteBuffer.allocate(4096);
  private boolean eof = false;

  public UTFRandomFileLineReader(FileChannel channel) {
    this.buffer = new CyclicBuffer(channel);
  }

  public String readLine() throws IOException {
    if (eof) {
      return null;
    }
    byte x = 0;
    temp.clear();

//    while ( ((((x = buffer.get()))) != (byte) -1) & amp;&amp; x != '\n') {
//      if (temp.position() == temp.capacity()) {
//        temp = addCapacity(temp);
//      }
//      temp.put(x);
//    }
    if (x == -1) {
      eof = true;
    }
    temp.flip();
    if (temp.hasRemaining()) {
      return charset.decode(temp).toString();
    } else {
      return null;
    }
  }

  private ByteBuffer addCapacity(ByteBuffer temp) {
    ByteBuffer t = ByteBuffer.allocate(temp.capacity() + 1024);
    temp.flip();
    t.put(temp);
    return t;
  }

  public static void main(String[] args) throws IOException {
    RandomAccessFile file = new RandomAccessFile("C:/Users/Vasantika/Desktop/logfile.txt",
        "rw");
    UTFRandomFileLineReader reader = new UTFRandomFileLineReader(file
        .getChannel());
    int i = 1;
    while (true) {
      String s = reader.readLine();
      if (s == null)
        break;
      System.out.println("\n line  " + i++);
      s = s + "\n";
      for (byte b : s.getBytes(Charset.forName("utf-8"))) {
        System.out.printf("%x", b);
      }
      System.out.printf("\n");

    }
  }
}
