package WorkingWithAbstraction.Exercises.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        int power = Ranks.valueOf(rank).getRankPower() + CardsSuit.valueOf(suit).getCardsSuitPower();
        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, power);
    }
}
