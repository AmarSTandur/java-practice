import javax.swing.*;
import java.util.Scanner;
public class Nestedif {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price;
        System.out.print("Enter a price : ");
        price=scanner.nextDouble();
        System.out.print("Are you Student : ");
        isStudent=scanner.nextBoolean();
        System.out.print("Are you senior : ");
        isSenior=scanner.nextBoolean();


        if(isStudent) {
            if (isSenior) {
                System.out.println("You are senior 20% discount");
                System.out.println("You are Student 10% discount");
                price *= 0.7;
            }
            else {
                System.out.println("You are Student 10% discount");
                price *= 0.9;
            }

            }
        else{
            if(isSenior){
                System.out.println("You are senior 20% discount");
                price *= 0.8;


            }
            else{
                System.out.println("You dont have any discount");
                price *= 1;
            }
        }
        System.out.printf("You Should pay %.2f",price);
    }
}
