package com.ohgiraffers.level03.hard;

public class Book {

    private String title;
    private String author;
    private int isbn;
    private boolean isForeignBook;

    public Book(String title, String author, int isbn, boolean isForeignBook) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isForeignBook = isForeignBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isForeignBook() {
        return isForeignBook;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 저자: " + author + ", ISBN: " + isbn + ", 해외 서적 여부: " + isForeignBook;
    }
}
