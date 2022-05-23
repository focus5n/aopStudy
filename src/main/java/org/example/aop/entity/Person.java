package org.example.aop.entity;

import org.example.aop.ui.Printer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Person {
    String name;
    String major;
    ArrayList<ExamScore> examList;

    @Autowired
    private Printer printer;

    public Person() {}

    public Person(String name, String major, String grade, ArrayList<ExamScore> examList) {
        super();

        this.name = name;
        this.major = major;
        this.examList = examList;
    }

    public void print(){
        String message = "Person [name=" + name + ", major="+major+"]\n" + "ExamList="+examList+"]";
        printer.print(message);
    }

    public HashMap<String, > getTotal(String s) {
    }

    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }
    public ArrayList<ExamScore> getExamList() {
        return examList;
    }
    public Printer getPrinter() { return printer; }

    public void setName(String name) {
        this.name = name;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setExamList(ArrayList<ExamScore> examList) {
        this.examList = examList;
    }
    public void setPrinter(Printer printer) { this.printer = printer; }



}
