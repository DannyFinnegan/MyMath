package Q2;


import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[100];

        System.out.println("Enter numbers between 1 and 100: ");
        int input = scanner.nextInt();

        while (input >= 1 && input <= 100) {
            counts[input - 1]++;
            input = scanner.nextInt();
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((i + 1) + " was entered " + counts[i] + " time(s).");
            }
        }
    }
}
