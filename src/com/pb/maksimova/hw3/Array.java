package com.pb.maksimova.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
  public static void main(String[] args) {


    System.out.println("Введите 10 целых чисел: ");
    Scanner scanner = new Scanner(System.in);

    int[] array = new int[10];

    array[0] = scanner.nextInt();
    array[1] = scanner.nextInt();
    array[2] = scanner.nextInt();
    array[3] = scanner.nextInt();
    array[4] = scanner.nextInt();
    array[5] = scanner.nextInt();
    array[6] = scanner.nextInt();
    array[7] = scanner.nextInt();
    array[8] = scanner.nextInt();
    array[9] = scanner.nextInt();
    System.out.println("Ваш массив: " + Arrays.toString(array)); //Вывод массива
    System.out.println("Сумма всех элементов массива: " + (array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]));

    int counter = 0;
    for (int i = 0; i<10; i++) {
      if (array[i] > 0)
        counter +=1;
    }
    System.out.println("Количество положительных эллементов: " + counter); //количество положительных эллементов

    boolean isSorted = false;
    int buf;
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          isSorted = false;

          buf = array[i];
          array[i] = array[i + 1];
          array[i + 1] = buf;
        }
      }

    }
    System.out.println("Сортировка от меньшего к большему: " + Arrays.toString(array)); //Сортировка от меньшего к большему
  }
}

