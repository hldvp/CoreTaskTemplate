package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .map(String::toLowerCase)
                .map(x -> x.replaceAll("\\p{Punct}", " "))
                .flatMap(x -> Stream.of(x.split("\\s+")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(
                    Comparator
                        .comparing((Function<Map.Entry<String, Long>, Long>) Map.Entry::getValue)
                        .reversed())
                .map(Entry::getKey)
                .limit(10)
                .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Проблеммы с входгым потоком");
        }

    }

//    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            reader.lines().map(str -> str.toLowerCase().replaceAll("\\p{Punct}", " ").split("\\s+"))
//                .flatMap(Arrays::stream)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().sorted(Map.Entry.comparingByKey())
//                .sorted(Comparator.comparing((Function<Map.Entry<String, Long>, Long>) Map.Entry::getValue).reversed())
//                .map(n -> n.getKey()).limit(10)
//                .forEach(System.out::println);
//        } catch (IOException e) {
//            System.out.println("Проблемы с входными данными");
//        }
//    }


}
