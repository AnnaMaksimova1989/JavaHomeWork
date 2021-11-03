package com.pb.maksimova.hw5;

public class Book {
  private java.lang.String titleBook;
  private java.lang.String author;
  private int yearPublication;

  public Book(java.lang.String titleBook, java.lang.String author, int yearPublication) {
    this.author = author;
    this.titleBook = titleBook;
    this.yearPublication = yearPublication;
  }

  public String toString() {
    return this.titleBook + " (" + this.author + " " + this.yearPublication + ")";
  }

  public String getTitleBook() {
    return titleBook;
  }
}

