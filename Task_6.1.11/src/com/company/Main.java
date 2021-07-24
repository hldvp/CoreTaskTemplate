package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(null, null);
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(null, null);
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }

    public static class Box<T> {

        private T object;

        public static <T> Box<T> getBox() {
            return new Box<>();
        }
    }

    public static class Pair<T, S> {

        private T first;
        private S second;

        private Pair(T first, S second) {
            this.first = first;
            this.second = second;
        }

        public static <T, S> Pair<T, S> of(T first, S second) {
            return new Pair<>(first, second);
        }

        public T getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            if (hashCode() != obj.hashCode()) {
                return false;
            }
            final Pair that = (Pair) obj;
            return Objects.equals(that.getFirst(), first) && Objects
                .equals(that.getSecond(), second);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(getFirst());
            result = prime * result + Objects.hashCode(getSecond());
            return result;
        }
    }
}


