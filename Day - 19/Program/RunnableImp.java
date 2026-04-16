public class RunnableImp {
    public static void main(String[] args) {

        Thread m = new Thread(new Music());
        Thread t1 = new Thread(new Timer1());
        Thread t2 = new Thread(new Timer2());

        m.start();
        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Music implements Runnable {
    public void run() {
        System.out.println("Song is getting played");
    }
}

class Timer1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The timer 1 is " + i);
        }
    }
}

class Timer2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("The timer 2 is " + i);
        }
    }
}