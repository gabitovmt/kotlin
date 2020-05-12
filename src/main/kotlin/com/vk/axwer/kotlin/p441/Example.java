package com.vk.axwer.kotlin.p441;

import java.util.Arrays;
import java.util.List;

// Объекты-одиночки Kotlin в Java
public class Example {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Bob"), new Person("Alice"));
        persons.sort(Person.NameComparator.INSTANCE);
        System.out.println(persons);
    }
}
