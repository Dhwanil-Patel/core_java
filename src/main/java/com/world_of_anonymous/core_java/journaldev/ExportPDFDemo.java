package com.world_of_anonymous.core_java.journaldev;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExportPDFDemo {
  public static void main(String[] args) {
    try {
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream("test.pdf"));
      document.open();

      Paragraph paragraph = new Paragraph("Employee Table");
      paragraph.setSpacingAfter(20);
      document.add(paragraph);

      PdfPTable table = new PdfPTable(3);
      PdfPCell cell = new PdfPCell(new Paragraph("First Name"));

      table.addCell(cell);
      table.addCell("Last Name");
      table.addCell("Gender");

      table.addCell("Dhwanil");
      table.addCell("Patel");
      table.addCell("Male");
      table.addCell("Vijay");
      table.addCell("Rathod");
      table.addCell("Male");

      document.add(table);
      document.close();
    } catch (DocumentException e) {
      e.printStackTrace();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
