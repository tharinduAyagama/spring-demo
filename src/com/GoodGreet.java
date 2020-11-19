package com;

import org.springframework.stereotype.Component;

@Component
public class GoodGreet implements SpecialGreet{
    @Override
    public String getSpecialTreat() {
        return "Hello sir";
    }
}
