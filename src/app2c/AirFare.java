
package app2c;
import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float fare;
        float tf;
        float km;
        float disc;
        
        System.out.print("Distance(km): ");
        float dis = sc.nextFloat();
        System.out.print("Class: ");
        float cl = sc.nextInt();
        
        
        if(cl == 1){
            fare = 250;
                tf = fare * dis;
                if(dis > 1000){
                    disc =  ((fare * dis) * .10f);
                    tf = tf - disc;
                }
                System.out.printf("Total fare: %.2f", tf);
        }else if(cl == 2){
            fare = 500;
                tf = fare * dis;
                if(dis > 1000){
                    disc =  ((fare * dis) * .10f);
                    tf = tf - disc;
                }
                System.out.printf("Total fare: %.2f", tf);
 
        }
            
    }
    
}
    

