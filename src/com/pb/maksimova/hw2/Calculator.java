package com.pb.maksimova.hw2;

 import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1;
        int operand2;
        char operation;

        System.out.println("Input operand1: ");
        operand1 = scanner.nextInt();

        System.out.println("Input operand2: ");
        operand2 = scanner.nextInt();

        System.out.println("Input operation (+ - * /) : ");
        operation = scanner.next().charAt(0);


        switch (operation) {
            case '+':
                System.out.println("Результат =" + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат =" + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Результат =" + (operand1 * operand2));
                break;
            case '/':{
                if (operand2 == 0) {
                    System.out.println("Делить на ноль нельзя!");
                }
                else {
                    System.out.println("Результат =" + (operand1 / operand2));}
            }
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");

        }

    }
}

