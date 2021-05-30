package com.world_of_anonymous.core_java.journaldev;

import java.io.*;
import java.util.ArrayList;

public class FIlePosition {

  public static void main(String args[]) {

//    Path p = Paths.get("C:/Users/Vasantika/Desktop/logfile.txt");
    // Defaults to READ
//    try
//    {
//
//    SeekableByteChannel sbc = Files.newByteChannel(p);
//      ByteBuffer buf = ByteBuffer.allocate(10);
//
//      // Read the bytes with the proper encoding for this platform.  If
//      // you skip this step, you might see something that looks like
//      // Chinese characters when you expect Latin-style characters.
//      String encoding = System.getProperty("file.encoding");
//      while (sbc.read(buf) > 0) {
//        buf.rewind();
//        System.out.print(Charset.forName(encoding).decode(buf));
//        buf.flip();
//      }
//    } catch (IOException x)
//    {
//      System.out.println("caught exception: " + x);
//    }
    FileReader fr = null;
    try {
      fr = new FileReader("C:/Users/Vasantika/Desktop/logfile.txt");
      BufferedReader reader = new BufferedReader(fr);
      String line = "";

      ArrayList<String> linee = new ArrayList<String>();

      while ((line = reader.readLine()) != null) {
        if (line.equals("# Possible reasons:"))
          break;
        linee.add(line);

      }
      reader.close();
      for (int i = linee.size() - 1; i >= 0; i--)
        System.out.println(linee.get(i));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}

