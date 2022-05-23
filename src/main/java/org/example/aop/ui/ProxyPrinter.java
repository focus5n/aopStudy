package org.example.aop.ui;

public class ProxyPrinter implements Printer {
    private Printer printer;

    public ProxyPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        System.out.println("before 핵심 코드보다 먼저 실행");
        printer.print(message);
        System.out.println("after 핵심 코드보다 나중에 실행");
    }
}
