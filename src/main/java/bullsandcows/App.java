package bullsandcows;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Hello, my friend!");
            Dictionary dict = new Dictionary("russian-short-utf.txt");
            final String answer = dict.randomWord();
            System.out.printf("I have a word for you to guess. It is %d letters long.%n", answer.length());
            int attempts = 20;
            boolean won = false;
            while (attempts > 0) {
                System.out.printf("%nYou have %d attempts left.%n", attempts);
                System.out.printf("What is your guess?%n > > > ");
                String guess = in.nextLine().toLowerCase();
                if (guess.length() != answer.length()) {
                    System.out.printf("Bad guess: you should provide exactly %d letters.%n", answer.length());
                    continue;
                }
                if (! BullsAndCows.isCorrectGuess(guess)) {
                    System.out.printf("Bad guess: you should provide latin letters only.%n");
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
            System.out.printf("%n");
            if (won) {
                System.out.printf("*** Victory! ***%n");
                System.out.printf("The correct answer is %s.%n", answer);
            } else {
                System.out.printf("--- Defeat. ---%n");
                System.out.printf("The correct answer is %s.%n", answer);
            }
        } catch (IOException e) {
            System.out.printf("Critical error with a dictionary file.%n");
            return;
        } catch (Exception e) {
            System.out.printf("Something went totally wrong.%n");
            return;
        }
    }
}
