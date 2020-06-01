package com.vk.axwer.kotlin.p6304;

import java.util.List;

// Другой интерфейс Java с коллекцией в качестве
public interface DataParser<T> {
    void parseData(String input, List<T> output, List<String> errors);
}
