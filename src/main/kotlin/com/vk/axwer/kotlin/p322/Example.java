package com.vk.axwer.kotlin.p322;

import java.util.Arrays;
import java.util.List;

import static com.vk.axwer.kotlin.p322.DefaultParametersKt.javaJoinToString;
import static com.vk.axwer.kotlin.p322.DefaultParametersKt.joinToString;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        System.out.println(joinToString(list, ",", "#", ";"));

        System.out.println(javaJoinToString(list, ",", "#", ";"));
        System.out.println(javaJoinToString(list, ",", "#"));
        System.out.println(javaJoinToString(list, ","));
        System.out.println(javaJoinToString(list));
    }
}
