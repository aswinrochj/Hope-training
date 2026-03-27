
public class Bank {

    public static void main(String[] args) {

        BankAccount bk = new BankAccount();
        bk.deposit(10);
        bk.withdraw(4);

    }
}


class BankAccount {
    private double balance;

    void deposit(int amount) {
        balance += amount;
        getBalance();
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawn : " + amount);
            getBalance();
        } else {
            System.out.println("The balance is empty");
        }
    }

    void getBalance() {
        System.out.println("Your account balance is : " + balance);
    }
}