package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> mas = new DynamicArray<>();
        for (int i = 0; i < 11; i++) {
            mas.add(i);
        }
        System.out.println(mas.size);
        System.out.println(mas);
        mas.remove(5);
        System.out.println(mas.size);
        System.out.println(mas);


    }

    public static class DynamicArray<T> {

        private int size = 0;
        private Object[] mas = new Object[10];

        public void add(T el) {
            if (size == mas.length) {
                this.mas = Arrays.copyOf(mas, mas.length * 2);
            }
            mas[size] = el;
            size++;
        }

        public void remove(int index) {
            System.arraycopy(mas,index+1,mas,index,mas.length-1-index);
            size--;
        }

        public T get(int index) {
            return (T) mas[index];
        }

        @Override
        public String toString () {
            String rezult = "[ ";
            for (Object el : mas) {
                if (el != null) {
                    rezult = rezult.concat(el.toString()).concat(", ");
                }
            }
            return rezult.concat("]");
        }
    }
}

