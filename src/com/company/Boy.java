package com.company;

public final class Boy extends Customer{
    private String name;
    private Market market;
    private Seller seller;

    public Boy(){

    }

    public Boy(int age, String nation, int money, String name, Market market, Seller seller) {
        super(age, nation, money);
        this.name = name;
        this.market = market;
        this.seller = seller;
    }

    public Boy(String name, Market market) {
        this.name = name;
        this.market = market;
    }

    public String getName(){
        return name;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nName: "+name+"\nMarket: "+market+
                "\nSeller name: "+seller.getName()+"\nSeller position: "+seller.getPosition();
    }
}
