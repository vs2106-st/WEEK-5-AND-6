package Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = 10;
            double[] salary = new double[size];
            double[] years = new double[size];
            double[] bonus = new double[size];
            double[] newSalary = new double[size];
            double totalBonus = 0, totalOld = 0, totalNew = 0;
            // Input
            for (int i = 0; i < size; i++) {
                System.out.print("Enter salary: ");
                salary[i] = scanner.nextDouble();
                
                System.out.print("Enter years of service: ");
                years[i] = scanner.nextDouble();
                
                if (salary[i] <= 0 || years[i] < 0) {
                    System.out.println("Invalid input, try again.");
                    i--;
                }
            }   // Processing
            for (int i = 0; i < size; i++) {
                if (years[i] > 5) {
                    bonus[i] = salary[i] * 0.05;
                } else {
                    bonus[i] = salary[i] * 0.02;
                }
                
                newSalary[i] = salary[i] + bonus[i];
                
                totalBonus += bonus[i];
                totalOld += salary[i];
                totalNew += newSalary[i];
            }   System.out.println("Total Bonus = " + totalBonus);
            System.out.println("Total Old Salary = " + totalOld);
            System.out.println("Total New Salary = " + totalNew);
        }
    }
}
