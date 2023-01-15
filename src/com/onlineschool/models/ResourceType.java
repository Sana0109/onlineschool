package com.onlineschool.models;

public enum ResourceType {
    BOOK("Name Book", "Author");
    private String  nameBook;
    private String author;

    ResourceType(String nameBook, String author) {
        this.nameBook = nameBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "ResourceType{" +
                "Name Book = '" + nameBook + '\'' +
                ", author = '" + author + '\'' +
                '}';
    }
}
