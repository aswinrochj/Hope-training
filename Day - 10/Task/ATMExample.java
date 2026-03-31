class ATM {

    private double balance = 5000; 

    // Method with throws keyword
    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }
    }
}

// Custom Exception Class
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}


public class ATMExample {

    public static void main(String[] args) {

        ATM user = new ATM();

        try {
            user.withdraw(6000); // trying to withdraw more than balance
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}