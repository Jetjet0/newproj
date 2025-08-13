
package app2c;
import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner je = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = je.nextLine();

        System.out.print("Enter marks in Science: ");
        double Science = je.nextDouble();

        System.out.print("Enter marks in History: ");
        double History = je.nextDouble();

        System.out.print("Enter marks in Math: ");
        double Math = je.nextDouble();

        System.out.print("Enter marks in Soc: ");
        double Soc = je.nextDouble();

        System.out.print("Enter marks in Arts: ");
        double Arts = je.nextDouble();

        
        double total = Science + History + Math + Soc + Arts;
        double average = total / 5.0;
 String remarks ;
   if (average < 70) {
    remarks = "Fail";
} else if (average >= 70 && average <= 75) {
    remarks = "Poor";
} else if (average > 75 && average <= 80) {
    remarks = "Fair";
} else if (average > 80 && average < 86) {
    remarks = "Good";
} else if (average >= 86 && average <= 90) {
    remarks = "Very Good";
} else {
    remarks = "Excellent";
}

        System.out.printf("\nTotal Marks: %.0f", total);
        System.out.printf("\nTotal percentage: %.2f", average);
        System.out.printf("\nRemarks: " + remarks);

        if (average < 70) {
            System.out.println("Try Again");
        } else {
            System.out.println("\nCongratsss " + name + " you Passed.");
        }

        
    }
    }

