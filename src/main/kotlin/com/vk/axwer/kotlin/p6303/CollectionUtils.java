package com.vk.axwer.kotlin.p6303;

import java.util.List;

public class CollectionUtils {
    public static List<String> upperCaseAll(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toUpperCase());
        }
        return items;
    }
}
