package org.example.aop.advice;

import org.example.aop.ui.ColorPrinter;
import org.example.aop.ui.Printer;
import org.example.aop.ui.ProxyPrinter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class AopTest {
    
    @Test
    @DisplayName("ProxyPattern 수동으로 만들기")
    void ProxyTest() {
        Printer printer = new ProxyPrinter(new ColorPrinter());
        printer.print("Hello, ColorPrinter!");
    }

//    public void print() {
//        String string = "Person [name = " + name + ", major =" + "]\n" + "ExamList = " + examList + "]";
//        printer.print(string);
//   }
//
//    public HashMap<String, Float> getTotal() {
//        ArrayList<ExamScore> exams = this.getExamList();
//        HashMap<String, Float> gradeAvg = new HashMap<>();
//
//        for (ExamScore exam : exams) {
//            Float avg = (float) (exam.getKor() + exam.getEng() + exam.getEng()) / 3;
//            gradeAvg.put(exam.getGrade(), avg);
//        }
//
//        System.out.println(gradeAvg);
//        return gradeAvg;
//    }
//
//    public HashMap<String, Float> getTotal(String grade) {
//        ArrayList<ExamScore> exams = this.getExamList();
//        HashMap<String, Float> gradeAvg = new HashMap<>();
//
//        for (ExamScore exam : exams) {
//            if (exam.getGrade().equals(grade)) {
//                Float avg = (float) (exam.getKor() + exam.getEng() + exam.getMat()) / 3;
//                gradeAvg.put(exam.getGrade(), avg);
//            }
//        }
//
//        System.out.println(gradeAvg);
//        return gradeAvg;
//    }
//
//    public void printThrowException() { throw new IllegalArgumentException(" => 고의로 발생시킴");}
}
