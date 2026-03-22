import java.util.Scanner;

public class subwayGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char move;
        boolean game = true;

        System.out.println("Subway Game Started");
        System.out.println("Use w (jump), s (roll), a (left), d (right), q (quit)");

        while (game) {

            System.out.print("Enter move: ");
            move = sc.next().charAt(0);

            int obstacle = (int)(Math.random() * 3);

            switch (move) {

                case 'w':
                    System.out.println("You jumped");
                    if (obstacle == 0) {
                        System.out.println("Train avoided");
                    }
                    break;

                case 's':
                    System.out.println("You rolled");
                    if (obstacle == 1) {
                        System.out.println("Barrier avoided");
                    }
                    break;

                case 'a':
                    System.out.println("Moved left");
                    if (obstacle == 2) {
                        System.out.println("Obstacle avoided");
                    }
                    break;

                case 'd':
                    System.out.println("Moved right");
                    if (obstacle == 2) {
                        System.out.println("Obstacle avoided");
                    }
                    break;

                case 'q':
                    System.out.println("Game Ended");
                    game = false;
                    break;

                default:
                    System.out.println("Wrong input");
            }
        }

        sc.close();
    }
}