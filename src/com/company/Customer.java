package com.company;

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

        public int givingCash(int money){
                this.money = money;
                return money;
        }

        private void givingCash(){
        }

        @Override
        public String getInfo() {
                return super.getInfo()+"\nCount of money: "+money;
        }
}
