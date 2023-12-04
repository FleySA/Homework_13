package com.proftelran.org.homework_13;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task_4 {
    public static void main(String[] args) {

        List<Auto> autos = Arrays.asList(
                new Auto("123", "black", "Toyota", 0, 35000),
                new Auto("456", "white", "Honda", 5000, 40000),
                new Auto("789", "black", "Ford", 0, 30000),
                new Auto("169", "rose", "Audi", 2000, 32000),
                new Auto("169", "black", "Audi", 0, 50000),
                new Auto("284", "Yellow", "Hammer", 2000, 60000),
                new Auto("777", "red", "Ferrari", 0, 75000),
                new Auto("789", "black", "Lada", 200000, 1000)
        );

        // Использование Stream API для вывода списка черных автомобилей с нулевым пробегом
        System.out.println("Списoк черных автомобилей с нулевым пробегом: ");
        autos.stream()
                .filter(auto -> auto
                        .getColor()
                        .equalsIgnoreCase("black") && auto
                        .getMileage() == 0)
                        .forEach(System.out::println);

        // Использование Stream API для подсчета уникальных марок в ценовом диапазоне от 1 до 50 тысяч
        Set<String> uniqueBrands = autos.stream()
                .filter(auto -> auto
                        .getPrice() >= 1 && auto
                        .getPrice() <= 50000)
                        .map(Auto::getBrand)
                        .collect(Collectors.toSet());

        System.out.println("Уникальные марки в ценовом диапазоне от 1 до 50 тысяч: " + uniqueBrands);
    }
}

