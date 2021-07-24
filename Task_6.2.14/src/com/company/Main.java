package com.company;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        Deque<Integer> array = new ArrayDeque<>();
        while (scanner.hasNext()) {
            if (i % 2 != 0) {
                array.addFirst(scanner.nextInt());
            } else {
                scanner.next();
            }
            i++;
        }
        PrintStream printStream = new PrintStream(System.out);
        for (Integer el : array) {
            printStream.print(el + " ");
        }
    }
}
