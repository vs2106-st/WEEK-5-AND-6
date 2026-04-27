package Level1;

import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            int number;
            int[] table = new int[10];

            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // Store values
            for (int i = 0; i < table.length; i++) {
                table[i] = number * (i + 1);
            }

            // Display
            for (int i = 0; i < table.length; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + table[i]);
            }
        }
    }
}
