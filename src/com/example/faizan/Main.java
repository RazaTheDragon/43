package com.example.faizan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner num=new Scanner(System.in);
        int integer=num.nextInt();
        for (int i=1;i>=1;i++){
            int b = integer%16;
            integer=integer/16;
                   if (b == 10) {
                System.out.print("a");
            } else if (b == 11) {
                System.out.print("b");
            } else if (b == 12) {
                System.out.print("c");
            } else if (b == 13) {
                System.out.print("d");
            } else if (b == 14) {
                System.out.print("e");
            } else if (b == 15) {
                System.out.print("f");
            } else if (b >0 & b<10){ System.out.print(b);
            }
        }

    }
}