package org.example.aop.ui;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ColorPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("--- Start Color Printer ---");
        System.out.println(message);
        System.out.println("--- End Color Printer ---");
    }
}
