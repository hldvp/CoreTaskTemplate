package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;


public class  Box <H> {
        public Box () {
            List<Integer> integerList = Arrays.asList(1, 2, 3);
            Gen gen = new Gen();
            gen.m(integerList);
        }

        static class Gen<T> {
            <T> void m(Collection<T> collection) {
                for (T s : collection) {
                    System.out.println(s);
                }
            }

            <T> void m(List<String> list) {
                for (String s : list) {
                    System.out.println(s);

                }
            }
        }
}