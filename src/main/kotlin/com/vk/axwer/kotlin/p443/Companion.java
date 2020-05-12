package com.vk.axwer.kotlin.p443;

public class Companion {
    public static void main(String[] args) {
        Person person = Person.Loader.fromJSON("{name: 'Dmitry'}");
        System.out.println(person.getName());

        User user = User.Companion.fromJSON("{name: 'Alex'}");
        System.out.println(user.getName());

        Man man1 = Man.Companion.fromJSON("{name: 'Helen'}");
        Man man2 = Man.fromJSON("{name: 'Alexandra'}");
        System.out.println(man1.getName());
        System.out.println(man2.getName());

        System.out.println(CompanionKt.person.getName());
        System.out.println(Person.person.getName());
    }
}
