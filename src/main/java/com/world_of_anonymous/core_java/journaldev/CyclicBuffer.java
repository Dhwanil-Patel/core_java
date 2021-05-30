package com.world_of_anonymous.core_java.journaldev;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CyclicBuffer {
  private static final int size = 3;
  private FileChannel channel;
  private ByteBuffer buffer = ByteBuffer.allocate(size);

  public CyclicBuffer(FileChannel channel) {
    this.channel = channel;
  }

  private int read() throws IOException {
    return channel.read(buffer);
  }

  /**
   * Returns the byte read
   *
   * @return byte read -1 - end of file reached
   * @throws IOException
   */
  public byte get() throws IOException {
    if (buffer.hasRemaining()) {
      return buffer.get();
    } else {
      buffer.clear();
      int eof = read();
      if (eof == -1) {
        return (byte) eof;
      }
      buffer.flip();
      return buffer.get();
    }
  }
}
