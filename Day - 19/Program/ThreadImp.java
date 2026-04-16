public class ThreadImp {
    public static void main(String[] args) {

        Thread m = new Music();
        Thread t1 = new Timer1();
        Thread t2 = new Timer2();

        m.start();
        t1.start();
        t2.start();

        try {
            t2.join(); // main thread waits for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Music extends Thread {
    public void run() {
        System.out.println("Song is getting played");
    }
}

class Timer1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); // sleep for 500ms between each print
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The timer 1 is " + i);
        }
    }
}

class Timer2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500); // sleep for 500ms between each print
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The timer 2 is " + i);
        }
    }
}