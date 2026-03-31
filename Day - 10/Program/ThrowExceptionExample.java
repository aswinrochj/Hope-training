class ThrowExceptionExample {

    public static void main(String[] args) {

        Bank b = new Bank();

        try {
            b.deposit(20);
            b.withdraw(50);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank {
    private double balance;

    void deposit(int amount) throws InsufficientBalanceException {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new InsufficientBalanceException("Amount can't be 0 or negative");
        }
    }

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawn: " + amount);
            getBalance();
        } else {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }

    void getBalance() {
        System.out.println("Your account balance is: " + balance);
    }
}