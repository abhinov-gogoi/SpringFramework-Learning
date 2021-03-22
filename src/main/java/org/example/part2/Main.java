package org.example.part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(MainConfig.class);
        Phone phone = factory.getBean(Phone.class);
        phone.feature();
    }
}
