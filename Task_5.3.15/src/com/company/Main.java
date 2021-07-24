package com.company;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        doubleSum(System.in,System.out);
    }

    public static void doubleSum(InputStream inputStream, PrintStream printStream) {
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }

        scanner.close();

        printStream.printf("%.6f", sum);
    }
}
