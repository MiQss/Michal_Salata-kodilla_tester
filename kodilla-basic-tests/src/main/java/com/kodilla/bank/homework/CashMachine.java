package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int size;
    String name;

    public CashMachine(String name) {
        this.size = 0;
        this.transactions = new double[0];
        this.name = name;
    }

    public void add(double value) {
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public double balance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public double getAverageWithdrawal() {

        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0) {
                sum += this.transactions[i];
            }
        }
        return sum / howManyWithdrawal();
    }
    public double getAveragePayment() {

        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0) {
                sum += this.transactions[i];
            }
        }
        return sum / howManyPayment();
    }
    public int howManyPayment() {
        if (this.size == 0) {
            return 0;
        }
        int number = 0;
        for (int i = 0; i < this.size; i++) {
            if (transactions[i] > 0) {
                number++;
            }
        }
        return number;
    }
    public int howManyWithdrawal() {
        if (this.size == 0) {
            return 0;
        }
        int number = 0;
        for (int i = 0; i < this.size; i++) {
            if (transactions[i] < 0) {
                number++;
            }
        }
        return number;
    }
}
