import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;


        System.out.print("Enter Your name😍😍 : ");
        name=scanner.nextLine();

        System.out.print("Enter your age🔢 : ");
        age = scanner.nextInt();

        System.out.print("Are you a Student(ture/false) x: ");
        isStudent=scanner.nextBoolean();

        if(isStudent){
            System.out.println("Yes, You are a Student!");
        }
        else {
            System.out.println("NO,Your are NOT a Student!");
        }



        if(name.isEmpty()){
            System.out.println("Heyy you didn't Enter your name!");

        }
        else {
            System.out.println("Hello "+name+ "!");
        }

        if(age>=18 && age<60){
            System.out.println("You are an adult!");
        }
        else if(age>=60){
            System.out.println("You are a Senior!");
        }

        else if (age==0) {
            System.out.println("You just born");

        }
        else if (age<0) {
            System.out.println("You are not born yet!");

        }
        else{
            System.out.println("Yur are not an adult!");
        }



        scanner.close();
    }
}
