package com.pb.maksimova.hw5;

public class Reader {
  private String fullName;
  private String numberLibraryCard;
  private String faculty;
  private String dateOfBirth;
  private String callNumber;

public Reader() {}
  public Reader(String name, String idCard, String fac, String birthday, String phone ) {
  this.fullName = name;
  this.numberLibraryCard = idCard;
  this.faculty = fac;
  this.dateOfBirth = birthday;
  this.callNumber = phone;
  }

  public void takeBook(int numBooks) {
    if (numBooks < 1)
      System.out.println("Читатель: " + fullName + " не брал книг в библиотеке");
    else if (numBooks == 1)
      System.out.println("Читатель: " + fullName + " взаял " + numBooks + " книгу");
    else if (numBooks < 5)
      System.out.println("Читатель: " + fullName + " взаял " + numBooks + " книги");
    else
      System.out.println("Читатель: " + fullName + " взаял " + numBooks + " книг");

  }
  public void takeBook(String... titleBooks) {
    for (int j = 0; j < titleBooks.length; j++) {
      if (j == 0) {
        System.out.println("Читатель " + fullName + " взял: ");
        System.out.print('"' + titleBooks[j] + '"' + ", ");
      } else if (j == (titleBooks.length - 1)) {
        System.out.println('"' + titleBooks[j] + '"' + '.');
      } else
        System.out.print('"' + titleBooks[j] + '"' + ", ");
    }
  }


  public void takeBook(Book... books) {
    for (int i = 0; i < books.length; i++) {
      if (i == 0) {
        System.out.println("Читатель " + fullName + " взял: ");
        System.out.println(books[i].toString());
      } else if (i == (books.length - 1)) {
        System.out.println(books[i].toString());
      } else
        System.out.println(books[i].toString());
    }
  }

  public void returnBook(int numBooks) {
    if (numBooks < 1)
      System.out.println("Читатель: " + fullName + " не брал книг в библиотеке");
    else if (numBooks == 1)
      System.out.println("Читатель: " + fullName + " вернул " + numBooks + " книгу");
    else if (numBooks < 5)
      System.out.println("Читатель: " + fullName + " вернул " + numBooks + " книги");
    else
      System.out.println("Читатель: " + fullName + " вернул " + numBooks + " книг");
  }

  public void returnBook(String... titleBooks) {
    for (int j = 0; j < titleBooks.length; j++) {
      if (j == 0) {
        System.out.println("Читатель " + fullName + " вернул: ");
        System.out.print('"' + titleBooks[j] + '"' + ", ");
      } else if (j == (titleBooks.length - 1)) {
        System.out.println('"' + titleBooks[j] + '"' + '.');
      } else
        System.out.print('"' + titleBooks[j] + '"' + ", ");
    }
  }

  public void returnBook(Book... arg) {
    for (int i = 0; i < arg.length; i++) {
      if (i == 0) {
        System.out.println("Читатель " + fullName + " вернул: ");
        System.out.println(arg[i].toString());
      } else if (i == (arg.length - 1)) {
        System.out.println(arg[i].toString());
      } else
        System.out.println(arg[i].toString());
    }
  }

  @Override
  public String toString() {
    return (fullName);
  }

  public String getFullName() {
    return fullName;
  }

  public String getNumberLibraryCard() {
    return numberLibraryCard;
  }

  public String getFaculty() {
    return faculty;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public String getCallNumber() {
    return callNumber;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setNumberLibraryCard(String numberLibraryCard) {
    this.numberLibraryCard = numberLibraryCard;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setCallNumber(String callNumber) {
    this.callNumber = callNumber;
  }
}
