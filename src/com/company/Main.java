package com.company;

public class Main {

    public static void main(String[] args) {

        Customer objectA = new Customer(25, "Russian", 2000);
        System.out.println(objectA.getInfo());
        System.out.println("-----------------------");

	    Boy objectB = new Boy("John", Market.APPLE);
//	    String boyName = objectB.getName();
//	    Market boyMarket = Market.APPLE;
//        System.out.println("Boy's name: "+boyName);
//        System.out.println("Boy will buy "+boyMarket);
        System.out.println(objectB.printInfo());
        System.out.println("Boy give "+objectB.givingCash(300)+" dollars");
        System.out.println("-----------------------");

        Boy objectC = new Boy(15, "Kyrgyz", 500, "John", Market.BALL, new Seller("Bob", "Cashier"));
        System.out.println(objectC.getInfo());
    }
}
