package org.example.aop.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtilLib {
    public static String lpad(String string, int length, String stringAddress) {
        StringBuilder result = new StringBuilder(string);
        int tempLength = length - result.length();

        for (int i = 0; i < tempLength; i++) {
            result.append(stringAddress);
        }

        return result.toString();
    }

    public static String currentDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }
}
