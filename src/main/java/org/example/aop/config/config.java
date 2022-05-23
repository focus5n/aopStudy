package org.example.aop.config;

import org.example.aop.entity.ExamScore;
import org.example.aop.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;

@ComponentScan(basePackages = "org.example.aop")
@EnableAspectJAutoProxy
public class config {

    @Bean
    Person person() {

        ArrayList<ExamScore> examScoreList = new ArrayList<>();
        examScoreList.add(new ExamScore("1", 100, 90, 80));
        examScoreList.add(new ExamScore("2", 70, 90, 90));
        examScoreList.add(new ExamScore("3", 85, 90, 50));

        Person person = new Person();
        person.setName("홍길동");
        person.setMajor("영문학");

        person.setExamList(examScoreList);
        return person;
    }
}
