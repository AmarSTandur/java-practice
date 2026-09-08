import java.sql.SQLOutput;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        String email;
        System.out.println("Enter your email : ");
        email=scanner.nextLine();

        if(email.contains("@")){
            String username = email.substring(0 ,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            System.out.println(username);
            System.out.println(domain);

        }
        else{
            System.out.println("The Email must contain the @ character");
        }




        scanner.close();


    }

}
