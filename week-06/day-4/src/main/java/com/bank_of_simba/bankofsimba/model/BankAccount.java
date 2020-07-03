package com.bank_of_simba.bankofsimba.model;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private boolean king;
    private boolean good;


    public BankAccount(String name, int balance, String animalType, boolean b, boolean b1) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = false;
        this.good = false;
    }

    public void raise() {
        if (this.king) {
            this.balance += 100;
        } else {
            this.balance += 10;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }
}
