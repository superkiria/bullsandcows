package bullsandcows;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, my friend!");
        final String answer = "a";
        System.out.printf("I have a word for you to guess. It is %d letters long.%n", answer.length());
        int attempts = 10;
        boolean won = false;
        while (attempts > 0) {
            System.out.printf("%nYou have %d attempts left.%n", attempts);
            System.out.printf("What is your guess?%n > > > ");
            String guess = in.nextLine();
            if (guess.length() != answer.length()) {
                System.out.printf("Bad guess: you should provide exactly %d letters%n", answer.length());
                continue;
            }
            int bulls = BullsAndCows.countBulls(answer, guess);
            int cows = BullsAndCows.countCows(answer, guess);
            if (bulls == answer.length()) {
                won = true;
                break;
            }
            System.out.printf(" ===== Your guess scores %d bulls and %d cows.%n", bulls, cows);
            attempts--;
        }

    }
}
