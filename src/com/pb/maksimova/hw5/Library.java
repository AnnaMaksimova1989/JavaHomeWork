package com.pb.maksimova.hw5;

public class Library {
  public static void main(String[] args) {
    Book[] books = {
        new Book("Приключения", "Иванов И. И.", 2000),
        new Book("Словарь", "Сидоров А. В", 1980),
        new Book("Энциклопедия", "Гусев К. В.", 2010)
    };

    Reader[] allReaders = {
        new Reader("Петров В.В.", "2583", "Журналистики", "15.07.1989", "380939927222"),
        new Reader("Горлова О.Ю.", "2584", "Финансы", "14.09.1976", "380679986772"),
        new Reader("Иванов О.Ю.", "2585", "Финансы", "06.10.1998", "3805594758")
    };

    String[] bookTitles = new String[books.length];
    for (int i = 0; i < books.length; i++) {
      bookTitles[i] = books[i].getTitleBook();
    }

    System.out.println("Все читатели:");
    for (Reader allReader : allReaders) System.out.println(allReader.toString());

    System.out.println("\nВсе книги:");
    for (Book book : books)  System.out.println(book.getTitleBook());


    System.out.println("\ntakeBook(int num)");
    allReaders[0].takeBook(books.length);

    System.out.println("\ntakeBook(String ... ars)");
    allReaders[0].takeBook(bookTitles);

    System.out.println("\ntakeBook(Book ... books)");
    allReaders[0].takeBook(books);

    System.out.println("\nreturnBook(int num)");
    allReaders[0].returnBook(books.length);

    System.out.println("\nreturnBook(String ... ars)");
    allReaders[0].returnBook(bookTitles);

    System.out.println("\nreturnBook(Book ... books)");
    allReaders[0].returnBook(books)

    ;
  }
}
