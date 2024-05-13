package com.pdfbox;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File; 
import java.io.IOException;

public class MergePdf {
   public static void main(String[] args) throws IOException {

      //Loading an existing PDF document
      File file1 = new File("C:\\Users\\OWNER\\Downloads\\PdfBox_Examples\\111.pdf");
      PDDocument doc1 = PDDocument.class(file1);
       
      File file2 = new File("C:\\Users\\OWNER\\Downloads\\PdfBox_Examples\\MayurThube_Resume.pdf");
      PDDocument doc2 = PDDocument.load(file2);
         
      //Instantiating PDFMergerUtility class
      PDFMergerUtility PDFmerger = new PDFMergerUtility();

      //Setting the destination file
      PDFmerger.setDestinationFileName("C:\\Users\\OWNER\\Downloads\\PdfBox_Examples\\/merged.pdf");

      //adding the source files
      PDFmerger.addSource(file1);
      PDFmerger.addSource(file2);

      //Merging the two documents
      PDFmerger.mergeDocuments();

      System.out.println("Documents merged");
      //Closing the documents
      doc1.close();
      doc2.close();
   }

}

