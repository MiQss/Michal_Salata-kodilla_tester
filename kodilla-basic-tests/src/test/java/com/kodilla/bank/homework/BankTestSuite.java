package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldAddTwoCashMachines() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine("machineOne");
        CashMachine machineTwo = new CashMachine("machineTwo");
        bank.addMachines(machineOne);
        bank.addMachines(machineTwo);
        bank.getNumberOfCashMachines();
        assertEquals(2, bank.addMachines(machineOne),0.01);
    }
    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine("machineOne");
        CashMachine machineTwo = new CashMachine("machineTwo");
        bank.addMachines(machineOne);
        bank.addMachines(machineTwo);
        machineOne.add(400.50);
        machineOne.add(-200.50);
        machineTwo.add(600.50);
        machineTwo.add(-300.50);

        assertEquals(500, bank.totalBalance(), 0.01);
    }
    @Test
    public void shouldCalculateTotalAveragePayment() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine("machineOne");
        CashMachine machineTwo = new CashMachine("machineTwo");
        bank.addMachines(machineOne);
        bank.addMachines(machineTwo);
        machineOne.add(400.00);
        machineOne.add(200.00);
        machineTwo.add(600.00);
        machineTwo.add(-200.00);

        assertEquals(450, bank.totalAveragePayment(), 0.01);
    }
    @Test
    public void shouldCalculateTotalAverageWithdrawal() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine("machineOne");
        CashMachine machineTwo = new CashMachine("machineTwo");
        bank.addMachines(machineOne);
        bank.addMachines(machineTwo);
        machineOne.add(200.00);
        machineOne.add(-200.00);
        machineTwo.add(-300.00);
        machineTwo.add(600.00);

        assertEquals(-250, bank.totalAverageWithdrawal(), 0.01);
    }
    @Test
    public void shouldCalculateNumberOfTotalPayment() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine("machineOne");
        CashMachine machineTwo = new CashMachine("machineTwo");
        bank.addMachines(machineOne);
        bank.addMachines(machineTwo);
        machineOne.add(400.50);
        machineOne.add(-400.50);
        machineOne.add(-200.50);
        machineTwo.add(400.50);
        machineTwo.add(-400.50);
        machineTwo.add(-200.50);

        assertEquals(2, bank.totalNumberPayment(), 0.01);
    }
    @Test
    public void shouldCalculateNumberOfTotalWithdrawal() {
        Bank bank = new Bank();
        CashMachine machineOne = new CashMachine("machineOne");
        CashMachine machineTwo = new CashMachine("machineTwo");
        bank.addMachines(machineOne);
        bank.addMachines(machineTwo);
        machineOne.add(-400.50);
        machineOne.add(-400.50);
        machineOne.add(200.50);
        machineTwo.add(-400.50);
        machineTwo.add(-400.50);
        machineTwo.add(-200.50);

        assertEquals(5, bank.totalNumberWithdrawal(), 0.01);
    }
}
