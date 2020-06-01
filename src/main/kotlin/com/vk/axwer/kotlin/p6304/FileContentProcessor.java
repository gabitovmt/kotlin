package com.vk.axwer.kotlin.p6304;

import java.io.File;
import java.util.List;

// Интерфейс Java с коллекцией в качестве параметра
interface FileContentProcessor {
    void processContents(File path, byte[] binaryContents, List<String> textContents);
}
