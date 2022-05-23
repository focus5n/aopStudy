package org.example.aop.ui;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MonoPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("--- Start Mono Printer ---");
        System.out.println(message);
        System.out.println("--- End Mono Printer ---");
    }
}
