package com.vk.axwer.kotlin.p511;

import com.vk.axwer.kotlin.p512.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Vladimir", 30),
                new Person("Rinat", 27),
                new Person("Marat", 14),
                new Person("Dmitri", 28)
        );
        // Реализация компаратора с помощью анонимного внутреннего класса
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(people);
    }
}
