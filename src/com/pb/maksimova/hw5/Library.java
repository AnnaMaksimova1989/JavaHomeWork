package com.pb.maksimova.hw5;

public class Library {
  public static void main(String[] args) {
    Book[] books = new Book[3];
    books[0] = new Book("Приключения", "Иванов И. И.", 2000);
    books[1] = new Book("Словарь", "Сидоров А. В", 1980);
    books[2] = new Book("Энциклопедия", "Гусев К. В.", 2010);
    Reader n111 = new Reader();
    Reader[] allReaders = new Reader[3];
    n111.setCallNumber("380939927222");
    n111.setDateOfBirth("15.07.1989");
    n111.setFullName("Петров В.В.");
    n111.setFaculty("Журналистики");
    n111.setNumberLibraryCard("2583");
    allReaders[0] = n111;
    allReaders[1] = new Reader();
    allReaders[2] = new Reader();
    allReaders[1].setFullName("Горлова О.Ю.");
    allReaders[2].setFullName("Патынка Т.С.");

    System.out.println("Все читатели:");
    for (int i = 0; i < allReaders.length; i++)
      System.out.println(allReaders[i].toString());

    System.out.println("\nВсе книги:");
    for (int i = 0; i < books.length; i++)
      System.out.println(books[i].toString());

    System.out.println("\ntakeBook(int num)");
    allReaders[0].takeBook(3);

    System.out.println("\ntakeBook(String ... ars)");
    allReaders[0].takeBook("Приключения", "Словарь", "Энциклопедия");

    System.out.println("\ntakeBook(Book ... books)");
    allReaders[0].takeBook(books)

    ;

    System.out.println("\nreturnBook(int num)");
    allReaders[0].returnBook(3);

    System.out.println("\nreturnBook(String ... ars)");
    allReaders[0].returnBook("Приключения", "Словарь", "Энциклопедия");

    System.out.println("\nreturnBook(Book ... books)");
    allReaders[0].returnBook(books)

    ;
  }
}
