package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //XML configuration
//        Greet visitor = getXMLContext().getBean("visitorGreet" , Greet.class);

        //Anotation class configuration
        Greet visitor = getClassContext().getBean("visitorGreet" , Greet.class);

        System.out.println(visitor.getGreeting());
        System.out.println(visitor.getGoodSpecialGreeting());
        System.out.println(visitor.getBadSpecialGreeting());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DanceConfig.class);
        Dancer dancer = context.getBean("dancer" , Dancer.class);
        System.out.println(dancer.getStyle());
    }

    private static ClassPathXmlApplicationContext getXMLContext(){
        return new ClassPathXmlApplicationContext("com/AppAnotation.xml");
    }
    private static AnnotationConfigApplicationContext getClassContext(){
        return new AnnotationConfigApplicationContext(Config.class);
    }
}
