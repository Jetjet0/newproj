
package activity4;

import java.util.Scanner;


public class Activity4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        float hr,gross;
        int thr;
        float sss;
        float nww = 0;
        System.out.print("Enter employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        hr = sc.nextFloat();
        System.out.print("Enter total hours worked this week: ");
        thr = sc.nextInt();
        
        System.out.println("---- Wage Summary ----");
        System.out.println("Employee: "+name);
        System.out.printf("Hourly Rate: ₱%.2f\n", hr);
        System.out.println("Hours Worked: "+thr);
        gross = hr * thr;
        System.out.printf("Gross Weekly Wage: ₱%.2f\n", gross);
        sss = (float) (gross * 0.10);
        System.out.printf("SSS Contribution: ₱%.2f\n", sss);
        System.out.println("---------------------------------");
        nww = gross - sss;
        System.out.printf("Next Weekly Wage: ₱%.2f\n", nww);
    }
    
}
