package CS101.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            while (true) {

                List<String> possibleNumbers = new ArrayList<>();
                for (int i = 0; i <= 999999; i++) {
                    String num = String.valueOf(i);

                    while (num.length() < 6) {
                        num = "0" + num;
                    }
                    possibleNumbers.add(num);
                }

                System.out.println(
                        "I will try to guess your 6-digit number. Provide me with feedback on my guesses in the form of two numbers: the number of digits that are correct and in the correct position, and the number of correct digits that are in the wrong position. Keep in mind that, for instance, if your secret code is 123456 and my guess is 222222, your input should be (1 and 5).  Let's begin! ");
                String guess = getRandomNumber(rand, possibleNumbers);
                int guessCount = 1;
                while (true) {
                    if (guessCount == 1) {
                        guess = "123456";
                    }
                    System.out.println("My guess is: " + guess);
                    System.out.print("Enter number of digits that are correct and in the correct position: ");
                    int correctInPlace = sc.nextInt();
                    System.out.print("Enter number of correct digits that are in the wrong position: ");
                    int correctOutOfPlace = sc.nextInt();
                    if (correctInPlace == 6) {

                        System.out.println("I won in " + guessCount + " guesses your secret code was " + guess);
                        break;
                    }
                    List<String> newPossibleNumbers = new ArrayList<>();
                    for (String num : possibleNumbers) {
                        int inPlace = 0;
                        int outOfPlace = 0;
                        for (int i = 0; i < num.length(); i++) {
                            if (num.charAt(i) == guess.charAt(i)) {
                                inPlace++;
                            } else if (num.indexOf(guess.charAt(i)) != -1) {
                                outOfPlace++;
                            }
                        }
                        if (inPlace == correctInPlace && outOfPlace == correctOutOfPlace) {
                            newPossibleNumbers.add(num);
                        }
                    }
                    if (newPossibleNumbers.size() == 0) {
                        System.out.println("You have provided inconsistent feedback. I cannot continue the game.");
                        break;
                    }
                    possibleNumbers = newPossibleNumbers;
                    guess = getRandomNumber(rand, possibleNumbers);
                    guessCount++;
                }
                System.out.println("Do you want to play again? (Y/N)");
                String playAgain = sc.next();
                if (!playAgain.equalsIgnoreCase("y")) {
                    break;

                }

            }
        }
    }

    public static String getRandomNumber(Random rand, List<String> possibleNumbers) {
        int index = rand.nextInt(possibleNumbers.size());
        return possibleNumbers.get(index);
    }

}