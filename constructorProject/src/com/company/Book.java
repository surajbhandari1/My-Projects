package com.company;

public class Book {
    String title;
    String author;
    int pages;
    String language;

    public Book(String title , String author, int pages, String language) {

        this.title=title;
        this.author=author;
        this.pages=pages;
        this.language=language;

        System.out.println("Book Name:" +this.title+"  Author Name:"+this.author+"  Number of Pages:  "+this.pages +"  Language used:  "+this.language);
    }
}
