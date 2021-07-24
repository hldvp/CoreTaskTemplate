package com.company;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import sun.nio.cs.US_ASCII;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Gen gen = new Gen();
        gen.m(integerList);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        Writer writer = new StringWriter();
        int i;
        while ((i = reader.read()) != -1 ) {
            writer.write(i);
        }
        return writer.toString();
    }

    public static void logging() throws ArithmeticException {
        int n = 10;
        System.out.println(n/0);
        System.out.println("1");


    }

    class Box<T> {

        private T object;
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
