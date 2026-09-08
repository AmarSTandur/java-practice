import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args){

        Random random =new Random();
        Scanner scanner =new Scanner(System.in);





//           Random method for alphabets

//        char letter = (char) ('a' + random.nextInt(26));
//        System.out.println(letter);
//        char letter1 = (char) ('A' + random.nextInt(26));
//        System.out.println(letter1);




        int guess;
        int attempts = 0;
        int min=1;
        int max=500;
        int Randomnumber=random.nextInt(min,max+1);

        System.out.println("Welcome to Number Guessing Game!");
        System.out.printf("Guess the Number between %d-%d : \n",min,max);

        do{
            System.out.print("Enter You Guessed Number : ");
            guess=scanner.nextInt();
            attempts++;

            if(guess< Randomnumber){
                System.out.println("Your guessing is TOO LOW!");
            }
            else if (guess>Randomnumber){
                System.out.println("Your guessing is TOO HIGH!");
            }
            else {
                System.out.println("Your Guess is correct");
            }
            

        }while(guess != Randomnumber);

        System.out.println("WOW You Won! ");
        System.out.println("Number of attempts you taken to guess : "+ attempts);

    }
}
