package com.kodilla.bank.homework;

public class Bank {
    private CashMachine [] cashmachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashmachines = new CashMachine[0];
    }

    public int addMachines(CashMachine index) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashmachines, 0, newTab, 0, cashmachines.length);
        newTab[this.size - 1] = index;
        this.cashmachines = newTab;
        return this.size-1;
    }

    public int getNumberOfCashMachines() {
        return size;
    }

    public double totalBalance() {
        if (size ==0){
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashmachines[i].balance();
        }
        return sum;
    }
    public double totalAveragePayment(){
        if (size ==0){
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashmachines[i].getAveragePayment();
        }
        return sum;
    }
    public double totalAverageWithdrawal(){
        if (size ==0){
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashmachines[i].getAverageWithdrawal();
        }
        return sum;
    }
    public int totalNumberPayment(){
        if (size ==0){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashmachines[i].howManyPayment();
        }
        return sum;
    }
    public int totalNumberWithdrawal(){
        if (size ==0){
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum+=cashmachines[i].howManyWithdrawal();
        }
        return sum;
    }
}



