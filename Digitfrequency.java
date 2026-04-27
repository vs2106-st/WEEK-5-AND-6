package Level3;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            int temp = number;
            int count = 0;
            
            // Count digits
            while (temp != 0) {
                temp /= 10;
                count++;
            }
            
            int[] digits = new int[count];
            int[] frequency = new int[10];
            
            temp = number;
            int index = 0;
            
            // Store digits
            while (temp != 0) {
                digits[index] = temp % 10;
                temp /= 10;
                index++;
            }
            
            // Calculate frequency
            for (int i = 0; i < digits.length; i++) {
                frequency[digits[i]]++;
            }
            
            // Display
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
                }
            }
        }
    }
}
