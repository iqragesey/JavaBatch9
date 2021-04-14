package com.class27.Homework;

public abstract class File {

    public abstract void open();

    void edit(){
        System.out.println("This is editing");
    }
    void close(){
        System.out.println("This is closing");
    }
}
class JavaFile extends File{

    @Override
    public void open() {
        System.out.println("To open a Java File you need sublime text");

    }
}
class WordFile extends File{

    @Override
    public void open() {
        System.out.println("To open a word file, you need Microsoft Word");

    }
}
class pdfFIle extends File{

    @Override
    public void open() {
        System.out.println("To open a PDF file, you need Adobe or a compatible program");

    }
}