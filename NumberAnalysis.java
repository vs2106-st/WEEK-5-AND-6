package Level1;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = 5;
            int[] numbers = new int[size];
            
            // Input
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }
            
            // Processing
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    if (numbers[i] % 2 == 0) {
                        System.out.println(numbers[i] + " is Positive and Even");
                    } else {
                        System.out.println(numbers[i] + " is Positive and Odd");
                    }
                } else if (numbers[i] < 0) {
                    System.out.println(numbers[i] + " is Negative");
                } else {
                    System.out.println("Number is Zero");
                }
            }
            
            // Compare first and last
            if (numbers[0] > numbers[size - 1]) {
                System.out.println("First element is greater");
            } else if (numbers[0] < numbers[size - 1]) {
                System.out.println("Last element is greater");
            } else {
                System.out.println("Both are equal");
            }
        }
    }
} 
