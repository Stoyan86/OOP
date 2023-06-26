package WorkingWithAbstraction.Lab.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        Rectangle rectangle = new Rectangle(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
        int numOfLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numOfLines; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt).toArray();
            Point newPoint = new Point(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(rectangle.contains(newPoint));
        }
    }
}
