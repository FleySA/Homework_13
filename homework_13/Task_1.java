package com.proftelran.org.homework_13;

import java.util.Arrays;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<String> surnames = Arrays.asList("Ivanov", "Petrov", "Kuznetsov", "Karpov", "Smith");

        // Использование Stream API для отображения фамилий, начинающихся на букву "K"
        surnames.stream()
                .filter(surname -> surname.startsWith("K"))
                .forEach(System.out::println);
    }
}
