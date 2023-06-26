package WorkingWithAbstraction.Lab.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double price = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Seasons season = Seasons.valueOf(input[2]);
        DiscountType discountType = DiscountType.valueOf(input[3]);
        PriceCalculator calculator = new PriceCalculator(price, days, season, discountType);
        double calculate = calculator.calculate();
        System.out.printf("%.2f", calculate);

    }
}
