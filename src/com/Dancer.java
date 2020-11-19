package com;

public class Dancer {

    private Dance dance;

    public Dancer(){}

    public Dancer(Dance dance){
        this.dance = dance;
    }

    public String getStyle(){
        return dance.getDancingStyle();
    }
}
