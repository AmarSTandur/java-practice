import java.sql.SQLOutput;
import java.util.Scanner;
public class Rectangle_area {
    public static void main(String[] args){
        double width=0;
        double height=0;
        double area=0;



        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter width of Rectangle :");
        width= scanner.nextDouble();
        System.out.print("Enter height of Rectangle :");
        height= scanner.nextDouble();


        area=width*height;

        System.out.print("Area of the rectangle : "+area+ "cm^2");




        scanner.close();

    }

}
