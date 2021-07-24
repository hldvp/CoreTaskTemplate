package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] a = new char[] {
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'
        };
        System.out.println(a.length);
        byte[] b = new byte[a.length];
        for (int i = 0; i < a.length; i++){
            b [i] = (byte) a[i];
        }
//        System.out.println(Arrays.toString(b));
        AsciiCharSequence f = new AsciiCharSequence(b);
        System.out.println(f.length());
//        System.out.println(f.charAt(2));
        String s = f.toString();
        System.out.println(s);
    }
}


