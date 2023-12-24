package linkedlist;

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

        // Создание LinkedList для карт игроков
        LinkedList<Integer> player1Deck = parseCards(player1Cards);
        LinkedList<Integer> player2Deck = parseCards(player2Cards);

        int moves = 0;

        // Игровой цикл
        while (moves <= 106) {
            // Инкремент числа ходов
            moves++;

            // Получение верхних карт игроков
            int card1 = player1Deck.poll();
            int card2 = player2Deck.poll();

            // Проверка, кто побеждает в текущем раунде
            if (card1 == 0 && card2 == 9) {
                // Победил первый игрок, добавляем карты в его колоду
                player1Deck.offer(card2);
                player1Deck.offer(card1);
            } else if (card1 == 9 && card2 == 0) {
                // Победил второй игрок, добавляем карты в его колоду
                player2Deck.offer(card1);
                player2Deck.offer(card2);
            } else if (card1 > card2) {
                // Победил первый игрок, добавляем карты в его колоду
                player1Deck.offer(card2);
                player1Deck.offer(card1);
            } else {
                // Победил второй игрок, добавляем карты в его колоду
                player2Deck.offer(card1);
                player2Deck.offer(card2);
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

    // Метод для преобразования строки с картами в LinkedList
    private static LinkedList<Integer> parseCards(String cards) {
        LinkedList<Integer> deck = new LinkedList<>();
        for (int i = 0; i < cards.length(); i++) {
            deck.offer(Character.getNumericValue(cards.charAt(i)));
        }
        return deck;
    }
}
