package com;

import org.springframework.stereotype.Component;

@Component("visiterGreet")
public class VisitorGreet implements Greet{
    @Override
    public String getGreeting() {
        return "hi dear";
    }
}
