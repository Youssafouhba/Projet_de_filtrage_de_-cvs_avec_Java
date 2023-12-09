package com.example.projetjava.Traitement;
import com.spire.pdf.*;
import java.io.*;

public class extractTextfromPDF {

    public void extractText(String filepath,String destinationDirectory ){

        //Create a Pdf file
        PdfDocument pdf = new PdfDocument();

        //Load the file from disk
        pdf.loadFromFile(filepath);

        //Create a StringBuilder instance
        StringBuilder sb = new StringBuilder();

        PdfPageBase page;
        //Traverse all the pages in the document.
        for (int i = 0; i < pdf.getPages().getCount(); i++) {
            page = pdf.getPages().get(i);
            //Extract the text from the pdf pages
            sb.append(page.extractText(true));
        }
        FileWriter writer;

        try {
            //Create a new txt file to save the extracted text
            String filename = destinationDirectory+"/cv.txt";
            writer = new FileWriter(filename);
            writer.write(sb.toString());
            writer.flush();
            Filtraing filtr = new Filtraing();
            File directory = new File(filepath);
            directory.delete();
            filtr.CvFiltring(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        pdf.close();

    }


}