package com.company;

import java.util.Random;

public class Customer extends Human{
        private int money;

        public Customer(){

        }

        public Customer(int age, String nation, int money) {
                super(age, nation);
                this.money = money;
        }

        private Customer(String nation, int money) {
                super(nation);
                this.money = money;
        }

        public int getMoney() {
                return money;
        }

        @Override
        public String getInfo() {
                return super.getInfo()+"\nCount of money: "+money;
        }
}
