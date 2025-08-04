
package app2c;
import benk1.benkClass;
import java.util.Scanner;

public class bank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                int attempt = 0;
                benkClass bc = new benkClass();

               
                while (attempt < 3 && !success) {
                    System.out.println("Attempt " + (attempt + 1) + " of 3");
                    
                    
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();

                    
                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        success = true;  
                    } else {
                        System.out.println("INVALID ACCOUNT or PIN!");
                        attempt++;
                    }
                }

               
                if (!success) {
                    System.out.println("YOu Entered The Pin 3 times a Row NOw Exiting...");
                    System.exit(0);  
                }
                break;

            case 2:
               
                break;

            case 3:
                break;

            default:
                System.out.println("Invalid Selection! Please choose a valid option.");
        }

    
    }
}
    
    

