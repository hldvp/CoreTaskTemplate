package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        test();
        Test t = new Test();
        t.metod();
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] mass = new RuntimeException().getStackTrace();
        System.out.println();
        for (StackTraceElement el : mass) {
            System.out.println(el.getClassName());
            System.out.println(el.getMethodName());
        }
        System.out.println();
        if (mass.length < 3) {
            return null;
        }
        return mass[2].getClassName().concat("#").concat(mass[2].getMethodName());
    }

//    public static String getCallerClassAndMethodName() {
//        StackTraceElement[] mass = new Throwable().getStackTrace();
//        if (mass.length < 3) {
//            return null;
//        }
//        return mass[2].getClassName().concat("#").concat(mass[2].getMethodName());
//    }

    public static void test() {
        System.out.println(getCallerClassAndMethodName());
    }
}
