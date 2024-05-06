
import java.util.Scanner;
public class Exam68 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the hour");
        double hour=input.nextDouble();
        if (hour<=3){
            System.out.println("Your Charge is $2.00");
        }
        else if(hour>3 && hour <10){
            double ahour;
            for (ahour=3.50;ahour<=hour;ahour++){
                ahour-=0.5;
            System.out.println("Your charge is $"+ahour);
                
            }
        }
        else if(hour>=10 && hour<24){
            System.out.println("Your Charge is $10");
        }
        else{
            System.out.println("No parking alowed more than 24 hour");
        }
    }
}

