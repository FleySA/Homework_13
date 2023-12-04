package com.proftelran.org.homework_13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task_3 {
    public static void main(String[] args) {

        List<Client> clients = Arrays.asList(
                new Client(1, "John", 25, Arrays.asList(new Phones("1234567890", PhoneType.MOBILE))),
                new Client(2, "Alice", 35, Arrays.asList(new Phones("9876543210", PhoneType.STATIONARY))),
                new Client(3, "Bob", 30, Arrays.asList(new Phones("5555555555", PhoneType.MOBILE))),
                new Client(4, "Eve", 40, Arrays.asList(new Phones("1112223333", PhoneType.STATIONARY)))
        );

        // Использование Stream API для поиска самого взрослого клиента со стационарным телефоном
        Optional<Client> result = clients.stream()
                .filter(client -> client.getPhones().stream().anyMatch(phone -> phone.getType() == PhoneType.STATIONARY))
                .max(Comparator.comparingInt(Client::getAge));

        result.ifPresent(System.out::println);
    }

}