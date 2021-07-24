package com.company;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Box b = new Box();

    }

    public static void be (List<?> list) {
        System.out.println(list);
    }


    public static Map<String, Long> getSalesMap(Reader reader) {
        HashMap<String, Long> resulMap = new HashMap<>();
        try (Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(" ");
                resulMap.merge(line[0], Long.parseLong(line[1]), (prise1, prise2) -> prise1 + prise2);
            }
        }
        return resulMap;
    }

}
