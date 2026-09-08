import com.sun.jdi.InconsistentDebugInfoException;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        String Day;
        System.out.print("Enter a Day : ");
        Day = scanner.nextLine();

        switch(Day){
            case "Monday","Tuesday","Wednesday","Thrusday" ,"Friday" -> System.out.println("It is a weekday🥲");
            case "Saturday","Sunday" -> System.out.println("It is a weekend😍");
            default -> System.out.println(Day +" it is a not a weekday");
        }




        scanner.close();
    }
}
