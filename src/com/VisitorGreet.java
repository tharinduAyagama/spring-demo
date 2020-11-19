package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VisitorGreet implements Greet{

    final SpecialGreet goodGreet;
    final SpecialGreet badGreet;

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
}
