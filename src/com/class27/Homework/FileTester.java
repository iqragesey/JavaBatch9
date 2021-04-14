package com.class27.Homework;

public class FileTester {

    public static void main(String[] args) {

        File java = new JavaFile();
        java.close();
        java.open();
        java.edit();

        File word = new WordFile();
        word.open();
        word.close();
        word.edit();

        File pdf = new pdfFIle();
        pdf.open();
        pdf.close();
        pdf.edit();
    }
}
