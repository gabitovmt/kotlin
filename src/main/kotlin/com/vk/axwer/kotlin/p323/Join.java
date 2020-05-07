package com.vk.axwer.kotlin.p323;

import java.util.Arrays;
import java.util.List;

import static com.vk.axwer.kotlin.p323.StringFunctions.joinToString;
import static com.vk.axwer.kotlin.p323.StringFunctions.performOperation;
import static com.vk.axwer.kotlin.p323.StringFunctions.reportOperationCount;

public class Join {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(joinToString(list, ", ", "[", "]"));

        reportOperationCount();
        performOperation();
        reportOperationCount();

        System.out.println(StringFunctions.getUNIX_LINE_SEPARATOR());
        System.out.println(StringFunctions.WINDOWS_LINE_SEPARATOR);
    }
}
