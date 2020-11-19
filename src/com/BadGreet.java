package com;

import org.springframework.stereotype.Component;

@Component
public class BadGreet implements SpecialGreet{
    @Override
    public String getSpecialTreat() {
        return "Hello bitch";
    }
}
