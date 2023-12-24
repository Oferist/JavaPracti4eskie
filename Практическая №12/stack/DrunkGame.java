package stack;

import java.util.Scanner;
import java.util.Stack;

public class DrunkGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> player1Deck = getInputDeck(scanner, "Введите карты первого игрока:");
        Stack<Integer> player2Deck = getInputDeck(scanner, "Введите карты второго игрока:");

        int moves = 0;
        while (moves < 106) {
            int card1 = player1Deck.pop();
            int card2 = player2Deck.pop();

            if (card1 < card2) {
                // Первый игрок выигрывает
                player1Deck.add(card1);
                player1Deck.add(card2);
            } else if (card1 > card2) {
                // Второй игрок выигрывает
                player2Deck.add(card1);
                player2Deck.add(card2);
            } else {
                // "Ботва"
                player1Deck.add(card1);
                player2Deck.add(card2);
            }

            moves++;

            if (player1Deck.isEmpty()) {
                System.out.println("second " + moves);
                return;
            } else if (player2Deck.isEmpty()) {
                System.out.println("first " + moves);
                return;
            }
        }

        System.out.println("botva");
    }

    private static Stack<Integer> getInputDeck(Scanner scanner, String prompt) {
        Stack<Integer> stack = new Stack<>();
        while (stack.size() != 5) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            stack = parseInput(input);

            if (stack.size() != 5) {
                System.out.println("\nПожалуйста, введите ровно 5 карт.\n");
            }
        }
        return stack;
    }

    private static Stack<Integer> parseInput(String input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            int card = Character.getNumericValue(input.charAt(i));
            stack.push(card);
        }
        return stack;
    }
}
