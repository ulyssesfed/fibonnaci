package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// print the fibonacci sequence up to the nth number, n is user input
        Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = scanner.nextInt();
    System.out.println("The fibonacci sequence is: ");
    fibonacci(n);
    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
