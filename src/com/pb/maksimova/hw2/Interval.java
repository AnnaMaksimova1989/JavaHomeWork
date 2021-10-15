package com.pb.maksimova.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int[] p1 = {0, 14};
        int[] p2 = {15, 35};
        int[] p3 = {36, 50};
        int[] p4 = {51, 100};

        String  result = "no period";

        System.out.print("Input a number: ");

        int x = in.nextInt();

        if (x>=p1[0] & x<=p1[1]){
            result = "[0-14]";
        }

        if (x>=p2[0] & x<=p2[1]){
            result = "[15-35]";
        }

        if (x>=p3[0] & x<=p3[1]){
            result = "[36-50]";
        }

        if (x>=p4[0] & x<=p4[1]){
            result = "[51-100]";
        }
        System.out.println(result);
    }
}