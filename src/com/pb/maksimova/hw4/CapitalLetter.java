package com.pb.maksimova.hw4;

import java.util.Scanner;

public class CapitalLetter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите тект:");

    String s = scanner.nextLine();
    char[] chars = s.toCharArray();

    chars[0] = Character.toUpperCase(chars[0]);
    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == ' ') {
        chars[i + 1] = Character.toUpperCase(chars[i + 1]);
      }
    }
    s = new String(chars);
    System.out.println(s);

  }
}
