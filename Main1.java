import java.io.SyncFailedException;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name =scanner.nextLine();

        System.out.print("Enter your Age :");
        int age=scanner.nextByte();

        System.out.print("Enter your CGPA :");
        double CGPA=scanner.nextDouble();

        System.out.print("Are you Student? (true/false) :");
        boolean isStudent=scanner.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+ " years old");
        System.out.println("Your CGPA : "+CGPA);
        if(isStudent){
            System.out.println("Yes he is a Student");

        }
        else{
            System.out.println("NO he is not a student");
        }

        scanner.close();



    }

}
