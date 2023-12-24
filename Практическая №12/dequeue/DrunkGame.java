package dequeue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DrunkGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод карт первого игрока
        System.out.print("Введите карты первого игрока: ");
        String player1Cards = scanner.next();

        // Ввод карт второго игрока
        System.out.print("Введите карты второго игрока: ");
        String player2Cards = scanner.next();

        // Создание деков для карт игроков
        Deque<Integer> player1Deck = parseCards(player1Cards);
        Deque<Integer> player2Deck = parseCards(player2Cards);

        int moves = 0;

        // Игровой цикл
        while (moves <= 106) {
            // Инкремент числа ходов
            moves++;

            // Получение верхних карт игроков
            int card1 = player1Deck.pollFirst();
            int card2 = player2Deck.pollFirst();

            // Проверка, кто побеждает в текущем раунде
            if (card1 == 0 && card2 == 9) {
                // Победил первый игрок, добавляем карты в его колоду
                player1Deck.offerLast(card2);
                player1Deck.offerLast(card1);
            } else if (card1 == 9 && card2 == 0) {
                // Победил второй игрок, добавляем карты в его колоду
                player2Deck.offerLast(card1);
                player2Deck.offerLast(card2);
            } else if (card1 > card2) {
                // Победил первый игрок, добавляем карты в его колоду
                player1Deck.offerLast(card2);
                player1Deck.offerLast(card1);
            } else {
                // Победил второй игрок, добавляем карты в его колоду
                player2Deck.offerLast(card1);
                player2Deck.offerLast(card2);
            }

            // Проверка на конец игры
            if (player1Deck.isEmpty()) {
                System.out.println("second " + moves);
                return;
            } else if (player2Deck.isEmpty()) {
                System.out.println("first " + moves);
                return;
            }
        }

        // Если программа дошла сюда, значит была ничья (botva)
        System.out.println("botva");
    }

    // Метод для преобразования строки с картами в дек целых чисел
    private static Deque<Integer> parseCards(String cards) {
        Deque<Integer> deck = new LinkedList<>();
        for (int i = 0; i < cards.length(); i++) {
            deck.offerLast(Character.getNumericValue(cards.charAt(i)));
        }
        return deck;
    }
}
