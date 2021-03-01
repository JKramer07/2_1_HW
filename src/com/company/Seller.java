package com.company;

public class Seller {
    private String name, position;

    public Seller(){

    }

    public Seller(String name, String position){
        this.name = name;
        this.position = position;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }


}
