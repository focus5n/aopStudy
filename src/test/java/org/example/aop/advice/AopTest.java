package org.example.aop.advice;

import org.aspectj.lang.annotation.Before;
import org.example.aop.entity.ExamScore;
import org.example.aop.entity.Person;
import org.example.aop.ui.ColorPrinter;
import org.example.aop.ui.Printer;
import org.example.aop.ui.ProxyPrinter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class AopTest {

    @Test
    @DisplayName("ProxyPattern 수동으로 만들기")
    void ProxyTest() {
        Printer printer = new ProxyPrinter(new ColorPrinter());
        printer.print("Hello, ColorPrinter!");
    }
}
