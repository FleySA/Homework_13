package com.proftelran.org.homework_13;

import java.util.Arrays;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");

        // Использование Stream API для сортировки строк в лексикографическом порядке
        strings.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
