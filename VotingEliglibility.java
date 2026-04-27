package Level1;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfStudents = 10;
            int[] ages = new int[numberOfStudents];
            
            // Input
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Enter age of student " + (i + 1) + ": ");
                ages[i] = scanner.nextInt();
            }
            
            // Processing
            for (int i = 0; i < ages.length; i++) {
                if (ages[i] < 0) {
                    System.out.println("Invalid age: " + ages[i]);
                } else if (ages[i] >= 18) {
                    System.out.println("Age " + ages[i] + " can vote");
                } else {
                    System.out.println("Age " + ages[i] + " cannot vote");
                }
            }
        }
    }
}
