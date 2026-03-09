import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser! Guess a number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessNumber(int playerNo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player " + playerNo + " guess a number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire {

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectGuesserNum() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }

    void collectPlayerNum() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNumber(1);
        numFromPlayer2 = p2.guessNumber(2);
        numFromPlayer3 = p3.guessNumber(3);
    }

    void compare() {

        if (numFromGuesser == numFromPlayer1)
            System.out.println("Player 1 won!");

        if (numFromGuesser == numFromPlayer2)
            System.out.println("Player 2 won!");

        if (numFromGuesser == numFromPlayer3)
            System.out.println("Player 3 won!");

        if (numFromGuesser != numFromPlayer1 &&
            numFromGuesser != numFromPlayer2 &&
            numFromGuesser != numFromPlayer3)
            System.out.println("No player guessed correctly.");
    }
}

public class Game {
    public static void main(String[] args) {

        Umpire u = new Umpire();

        u.collectGuesserNum();
        u.collectPlayerNum();
        u.compare();
    }
}