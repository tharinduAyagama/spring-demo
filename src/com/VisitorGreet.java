package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VisitorGreet implements Greet{

    private final SpecialGreet goodGreet;
    private final SpecialGreet badGreet;
    @Value("${foo.name}")
    private String name;
    @Value("${foo.email}")
    private String email;

    public VisitorGreet(@Qualifier("goodGreet") SpecialGreet goodGreet, @Qualifier("badGreet") SpecialGreet badGreet){
        this.goodGreet = goodGreet;
        this.badGreet = badGreet;
    }

    @Override
    public String getGreeting() {
        return "hi dear";
    }

    @Override
    public String getGoodSpecialGreeting(){
        return goodGreet.getSpecialTreat();
    }

    @Override
    public String getBadSpecialGreeting() {
        return badGreet.getSpecialTreat();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
