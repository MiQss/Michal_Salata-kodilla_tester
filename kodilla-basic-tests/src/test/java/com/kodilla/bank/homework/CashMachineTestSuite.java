package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine("machineOne");
        double[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine("machineOne");
        cashMachine.add(400.50);
        cashMachine.add(-200.50);

        double[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(400.50, transactions[0]);
        assertEquals(-200.50, transactions[1]);
    }
    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine("machineOne");
        cashMachine.add(400.50);
        cashMachine.add(-200.50);

        assertEquals(200, cashMachine.balance(), 0.01);
    }
    @Test
    public void shouldCalculateNumberOfTransaction() {
        CashMachine cashMachine = new CashMachine("machineOne");
        cashMachine.add(400.50);
        cashMachine.add(400.50);
        cashMachine.add(-200.50);

        assertEquals(3, cashMachine.howManyTransactions(), 0.01);
    }
    @Test
    public void shouldCalculateAverageWithdrawal() {
        CashMachine cashMachine = new CashMachine("machineOne");
        cashMachine.add(-200.00);
        cashMachine.add(-300.00);
        cashMachine.add(-400.00);

        assertEquals(-300.00, cashMachine.getAverageWithdrawal(), 0.01);
    }
    @Test
    public void shouldCalculateAveragePayment() {
        CashMachine cashMachine = new CashMachine("machineOne");
        cashMachine.add(200.00);
        cashMachine.add(300.00);
        cashMachine.add(400.00);

        assertEquals(300.00, cashMachine.getAveragePayment(), 0.01);
    }
    @Test
    public void shouldCalculateNumberOfPayment() {
        CashMachine cashMachine = new CashMachine("machineOne");
        cashMachine.add(400.50);
        cashMachine.add(-400.50);
        cashMachine.add(-200.50);

        assertEquals(1, cashMachine.howManyPayment(), 0.01);
    }
    @Test
    public void shouldCalculateNumberOfWithdrawal() {
        CashMachine cashMachine = new CashMachine("machineOne");
        cashMachine.add(-400.50);
        cashMachine.add(400.50);
        cashMachine.add(-200.50);

        assertEquals(2, cashMachine.howManyWithdrawal(), 0.01);
    }
}
