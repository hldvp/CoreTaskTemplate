package com.company;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Comparable
        Comparator

//        System.out.println(getGenerator());

//        Predicate<Object> condition = Objects::isNull;
//        Function<Object, Integer> ifTrue = obj -> 0;
//        Function<CharSequence, Integer> ifFalse = CharSequence::length;
//        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
//        System.out.println(safeStringLength.apply("vv"));

        pseudoRandomStream(13).forEach(x -> System.out.print(x+"  "));
//        List <Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(2);
//        list.add(3);
//        System.out.println(list.get(list.size()-1));
    }


    public UnaryOperator<Integer> sqrt() {
       return (x -> x * x);
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return (x -> (x.intValue() > 0));
    }

    public static <T, U> Function<T, U> ternaryOperator(
        Predicate<? super T> condition,
        Function<? super T, ? extends U> ifTrue,
        Function<? super T, ? extends U> ifFalse) {

        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000).limit(10);
    }

    public <T> void findMinMax(
        Stream<? extends T> stream,
        Comparator<? super T> order,
        BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (!list.isEmpty()) {
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}
