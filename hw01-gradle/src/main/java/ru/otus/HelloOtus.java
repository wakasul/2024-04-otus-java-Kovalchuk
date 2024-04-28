package ru.otus;

import com.google.common.collect.Range;

public class HelloOtus {
    public static void main(String... args) {
        Range<Integer> integerRange = Range.open(10, 1000);
        System.out.println(integerRange.contains(100));
        System.out.println(integerRange.contains(10000));
    }
}
