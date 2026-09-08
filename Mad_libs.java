import java.awt.*;
import java.util.Scanner;
public class Mad_libs {
    public static void main(String[] args){


        Scanner scanner=new Scanner(System.in);

        String object1;
        String object2;
        String object3;
        String object4;
        String object5;


        System.out.print("Enter a movie name : ");
        object1= scanner.nextLine();
        System.out.print("Enter you liked seen : ");
        object2= scanner.nextLine();
        System.out.print("Enter one actor name : ");
        object3= scanner.nextLine();
        System.out.print("your interst : ");
        object4= scanner.nextLine();
        System.out.print("Enter learning platform : ");
        object5= scanner.nextLine();


        System.out.println("Today i was going to "+object1+ " ");
        System.out.println("And there i saw one seen like "+object2);
        System.out.println("and i am curies about that actor "+object3+ " who acted that seen");
        System.out.println(" by seeing that seen i got interseted in "+object4);
        System.out.println("so i planned to join acting "+object5);




        scanner.close();

    }
}
