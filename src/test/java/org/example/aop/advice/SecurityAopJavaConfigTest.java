package org.example.aop.advice;

import org.example.aop.entity.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = config.class)
public class SecurityAopJavaConfigTest {

    @Autowired
    private ApplicationContext context;
    private Person person;

    @BeforeEach
    public void setup() { person = context.getBean(Person.class); }

    @Test
    @DisplayName("AOP-JavaConfig 정상실행 - 클라이언트 person.print() 호출")
    public void aopNoParamTest() {
        System.out.println("\n### STEP0 : 클라이언트 person.getTotal() 호출");
        person.print();
    }
}
