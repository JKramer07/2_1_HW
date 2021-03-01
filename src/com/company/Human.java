package com.company;

import java.util.Random;

public class Human {
    private int age;
    private String nation;

    public Human(){

    }

    public Human(int age, String nation){
        this.age = age;
        this.nation = nation;
    }

    public Human(String nation) {
        this.nation = nation;
    }

    public int getAge(){
        return age;
    }

    public String getNation(){
        return nation;
    }

    public String getInfo(){
        return "Age: "+age+"\nNation: "+nation;
    }

}
