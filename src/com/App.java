package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/AppAnotation.xml");
        Greet visitor = context.getBean("visiterGreet" , Greet.class);
        System.out.println(visitor.getGreeting());
        context.close();
    }
}
