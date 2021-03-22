package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); // can use BeanFactory or ApplicationContext

        Vehicle car = (Vehicle) context.getBean("car");
        car.drive();

//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t);

    }
}
