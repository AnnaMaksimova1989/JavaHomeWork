package com.pb.maksimova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
  public static void main(String[] args) {
    Random random = new Random();

    boolean isGameFinish = false;
    int maxValue = 100;
    int minValue = 0;
    int attempt = 0;

    int x = random.nextInt(maxValue + 1);
    System.out.println("Загадано число: " + x);

    System.out.println("Для выхода из игры введите" + " 777 ");
    System.out.println("Давайте сыграем, угадайте целое число от " + minValue + " до " + maxValue + ": ");

    Scanner scanner = new Scanner(System.in);

    while (!isGameFinish) {
      attempt++;
      System.out.println("Попытка" + attempt + ":");

      int digit;
      digit = scanner.nextInt();

      if (digit == 777) {
        break;

      } else if (digit < minValue || digit > maxValue) {
        System.out.println("Вы ввели число вне правил, число должно быть от 0 до 100. Повторите попытку");

      } else if (digit > x) {
        System.out.println("Попробуйте ещё раз, загаданное число меньше: ");


      } else if (digit < x) {
        System.out.println("Попробуйте ещё раз, загаданное число больше: ");


      } else if (digit == x) {
        System.out.println("Поздравляем, Вы угадали с " + attempt + "попытки!");
        isGameFinish = true;
        break;
      }
    }
  }
}

