package com.springboot.college.util.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Description TODO
 * @Date 2020/6/24 11:49
 * @Created by ren
 */
public class PDFMake  {

    public void generatePdf() throws FileNotFoundException,DocumentException{

        Document document = new Document();

        PdfWriter pdfWriter = PdfWriter.getInstance(document,new FileOutputStream("D:/pdf.pdf"));

        document.open();

        PdfPTable pdfPTable = new PdfPTable(5);

    }
}
