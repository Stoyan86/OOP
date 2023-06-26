package WorkingWithAbstraction.Lab.RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= size; i++) {
                printRow(i,size);
        }
        for (int i = size - 1; i > 0 ; i--) {
            printRow(i, size);
        }
    }
    public static void printRow(int countStars, int size){
        int numSpaces = size - countStars;
        for (int i = numSpaces; i > 0; i--) {
            System.out.print(" ");
        }
        for (int j = 0; j < countStars; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}