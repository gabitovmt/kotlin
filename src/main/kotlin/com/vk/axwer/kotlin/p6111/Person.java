package com.vk.axwer.kotlin.p6111;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {
    private final String name;
    private final String firstName;
    private final String lastName;

    public Person(
            String name,
            @NotNull String firstName,
            @Nullable String lastName
    ) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String name) {
        this.name = name;
        this.firstName = null;
        this.lastName = null;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
