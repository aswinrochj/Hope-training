public class ConcurrencyImp {

    public static void main(String[] args) {

        Bank b = new Bank();
        Runnable task = () -> {
            b.withdraw(700);
        };
        Thread t1 = new Thread(task, "User 1");
        Thread t2 = new Thread(task, "User 2");

        t1.start();
        t2.start();
    }

}

class Bank {
    int balance = 1000;

    synchronized void withdraw(int amount) {

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing");
            balance -= amount;
            System.out.println("The remaining amount is : " + balance);
        } else {

            System.out.println("Insufficent balance.....");
        }

    }
}
