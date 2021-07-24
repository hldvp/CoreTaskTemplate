package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(symmetricDifference(set1,set2));

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set <T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        Set <T> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        resultSet.removeAll(temp);
        return resultSet;
    }
}
