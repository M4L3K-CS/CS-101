package CS101.Game;
import static java.util.Collections.shuffle;
import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HumanMastermind {

    private final Scanner scanner;
    private final int MAX_NUMBER;
    private final int CODE_LENGTH;
    private int tryCount;
    private int playCount = 0;

    public HumanMastermind() {
        this(9, 4);
    }

    public HumanMastermind(int maxNumber, int codeLength) {
        scanner = new Scanner(System.in);
        MAX_NUMBER = maxNumber;
        CODE_LENGTH = codeLength;
    }

    void newGame() {
        tryCount = 0;
        playCount++;
        List<Integer> correctAnswer = newCorrectAnswer();
        guessAnswer(correctAnswer);
        if (playerWannaContinue()) {
            newGame();
        }
        System.out.println(" SEE YOU NEXT TIME ");
    }

    private List<Integer> newCorrectAnswer() {
        IntStream integerStream = IntStream.range(0, MAX_NUMBER + 1);
        List<Integer> integerList = streamToIntegerList(integerStream);
        shuffle(integerList);
        return integerList.subList(0, CODE_LENGTH);
    }

    private List<Integer> streamToIntegerList(IntStream stream) {
        return stream.boxed().collect(toList());
    }

    private void guessAnswer(List<Integer> correctAnswer) {
        tryCount++;
        System.out.print(" WELCOME PLEASE INPUT YOUR GUESS : ");
        List<Integer> playerGuess = getPlayerGuess();

        if (correctAnswer.equals(playerGuess)) {
            showWinResults();
            return;
        }
        showHints(correctAnswer, playerGuess);
        guessAnswer(correctAnswer);
    }

    private List<Integer> getPlayerGuess() {
        String playerInput = scanner.next();
        if (isValidInput(playerInput)) {
            return inputToIntegerList(playerInput);
        }
        return getPlayerGuess();
    }

    private boolean isValidInput(String input) {
        if (!input.matches("[0-9]+")) {
            System.out.print(" NOT A NUMBER ");
            return false;
        }
        if (CODE_LENGTH != input.length()) {
            System.out.print(" INPUT 6 DIGITS PLEASE ");
            return false;
        }
        return true;
    }

    private List<Integer> inputToIntegerList(String input) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            integerList.add(Integer.parseInt(String.valueOf(input.charAt(i))));
        }
        return integerList;
    }

    private void showWinResults() {
        System.out.println(" CONGRATS YOU WON ");
        System.out.println(" TRY COUNT " + tryCount);
        System.out.println(" PLAY COUNT " + playCount);
    }

    private void showHints(List<Integer> correctAnswer, List<Integer> playerGuess) {
        int hit = 0, blow = 0;
        for (int i = 0; i < CODE_LENGTH; i++) {
            for (int j = 0; j < CODE_LENGTH; j++) {
                if (!correctAnswer.get(i).equals(playerGuess.get(j))) {
                    continue;
                }
                if (i == j) {
                    hit++;
                } else {
                    blow++;
                }
            }
        }
        System.out.println(hit + " HIT, " + blow + " BLOW ");
    }

    private boolean playerWannaContinue() {
        System.out.print(" WANNA PLAY AGAIN ? (Y / N): ");
        String input = scanner.next();
        if (input.equals("Y") || input.equals("N")) {
            return input.equals("Y");
        }
        System.out.print(" Y or N : ");
        return playerWannaContinue();
    }
}