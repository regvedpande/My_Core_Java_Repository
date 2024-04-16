package com.mkpits.staticandnonstatic;

public class InstanceVariablePractice {
    
    private String name;

    public InstanceVariablePractice(String name){
        this.name = name;
    }

    public String giveinfo(){
        System.out.println("German Shepherd");
        return name;
    }

    public static void main(String[] args) {
        InstanceVariablePractice p = new InstanceVariablePractice("Regved");
        p.giveinfo();
    }

}


