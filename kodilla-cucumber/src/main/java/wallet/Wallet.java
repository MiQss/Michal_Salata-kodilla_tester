package wallet;

public class Wallet {
    private int balance = 0;
    public Wallet() {

    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }
    public String debit(int money) {
        String display = "You have enough money";
        if (this.balance >= money) {
            this.balance -= money;
            return display;
        }
        display = "You don't have enough money";
        System.out.println(display);
        return display;
    }
    public String displayBalance() {
        String display = "The balance of yor wallet is: $" + balance;
        System.out.println(display);
        return display;
    }

}
