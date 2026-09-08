import java.util.Scanner;
public class Logical {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
//         String username;
//
//        System.out.print("Enter the Username : ");
//        username=scanner.nextLine();
//
//        if(username.length()<4|| username.length()>12) {
//            System.out.println("Username must be in between 4-12");
//        }
//        else if(username.contains(" ") || username.contains("_")){
//            System.out.println("user name must not contain underscore and space");
//        }
//        else{
//            System.out.println("Welcome "+username);
//        }



        int Temp;


        System.out.print("Enter the temperature : ");
        Temp=scanner.nextInt();


        if(Temp<0 && Temp>35){
            System.out.println("Bad Weather ");

        }
        else{
            System.out.println("Good weather");

        }
        scanner.close();


    }
}
