import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        String username ="";
//
//
//        while(username.isEmpty()){
//            System.out.print("Enter your Username : ");
//            username=scanner.nextLine();
//
//        }
//        System.out.println( "Welcome "+username );




//        int num;
//
//
//
//
//        do{
//            System.out.print("Enter number between 1-10: ");
//            num=scanner.nextInt();
//
//        }while(num< 1||num>10);
//        System.out.println("You picked number is "+num);


        int age;

        do{
            System.out.println("age cannot be in negative amd in must not exceed the 100 ");
            System.out.print("Enter your age : ");
            age=scanner.nextInt();
        }while(age<1 || age>100);
        System.out.println("You are the "+ age +" years old");

         scanner.close();
    }
}
