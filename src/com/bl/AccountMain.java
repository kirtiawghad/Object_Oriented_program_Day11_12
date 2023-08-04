package com.bl;

public class AccountMain {
    public static void main(String[] args) {
        Account obj = new Account(25000);
        obj.credit(200);
        obj.debit(50);
    }
}
