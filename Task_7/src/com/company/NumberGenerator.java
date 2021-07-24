package com.company;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean b = true;
    boolean cond(T arg);

    default void reed (T t) {
        System.out.println(t);
    }

    default String str (T t) {
        return t.toString();
    }

    static boolean tt () {
        return b;
    }
}
