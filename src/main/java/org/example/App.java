package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {
    public static void main( String[] args ) {

        // using BeanFactory
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("ApplicationContext.xml"));
//        Vehicle car1 = (Vehicle) factory.getBean("car");
//        car1.drive();

        //  using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Vehicle car2 = (Vehicle) context.getBean("car");
        car2.drive();

//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t);
    }
}
