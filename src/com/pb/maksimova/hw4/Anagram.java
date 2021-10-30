package com.pb.maksimova.hw4;

import java.util.Scanner;

public class Anagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите тект первой строки:");
    String s1 = scanner.nextLine();

    System.out.println("Введите тект второй строки:");
    String s2 = scanner.nextLine();

    char[] chArr1 = s1.toUpperCase().toCharArray();
    char[] chArr2 = s2.toUpperCase().toCharArray();
    for (int i = chArr1.length - 1; i > 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        if (chArr1[j] > chArr1[j + 1])
        {
          char tmp = chArr1[j];
          chArr1[j] = chArr1[j + 1];
          chArr1[j + 1] = tmp;
        }
      }
    }
    for (int i = chArr2.length - 1; i > 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        if (chArr2[j] > chArr2[j + 1])
        {
          char tmp = chArr2[j];
          chArr2[j] = chArr2[j + 1];
          chArr2[j + 1] = tmp;
        }
      }
    }

    String valueOfchar1 = String.valueOf(chArr1);
    String valueOfchar2 = String.valueOf(chArr2);
    valueOfchar1 = valueOfchar1.replaceAll("\\W", "");
    valueOfchar2 = valueOfchar2.replaceAll("\\W", "");

    System.out.println(valueOfchar1.equalsIgnoreCase(valueOfchar2));

  }
}
