package org.example.aop.ui;

public class ProxyPrinter implements Printer {
    private Printer printer;

    public ProxyPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {

        System.out.println("before");
        printer.print(message);
        System.out.println("after");
    }
}
