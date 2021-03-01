package com.company;

public class Main {

    public static void main(String[] args) {

        Customer objectA = new Customer(25, "Russian", 2000);
        int custAge = objectA.getAge();
        String custNation = objectA.getNation();
        int custMoney = objectA.getMoney();
        System.out.println("Customer's age: "+custAge);
        System.out.println("Customer's nation: "+custNation);
        System.out.println("Customer has "+custMoney+" dollars.");
        System.out.println("-----------------------");

	    Boy objectB = new Boy("John", Market.APPLE);
	    String boyName = objectB.getName();
	    Market boyMarket = Market.APPLE;
        System.out.println("Boy's name: "+boyName);
        System.out.println("Boy will buy "+boyMarket);
        System.out.println("-----------------------");

        Boy objectC = new Boy(15, "kyrgyz", 500, "John", Market.BALL, new Seller("Bob", "Cashier"));
        String boyInfo = objectC.getInfo();
        System.out.println(boyInfo);
    }
}
