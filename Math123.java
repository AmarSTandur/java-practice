import java.util.Scanner;
public class Math123 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        double a;
        double b;
        double c;
        double radius;
        double circumference;
        double area;
        double volume;


        System.out.print("Enter the radius : ");
        radius= scanner.nextDouble();

        System.out.print("Enter the Hypotenenus lengh of side 'A' : ");
        a= scanner.nextDouble();

        System.out.print("Enter the Hypotenenus lengh of side 'B' : ");
        b= scanner.nextDouble();


        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        circumference=2*Math.PI*radius;
        area=Math.PI*Math.pow(radius,2);
        volume=(4/3)*Math.PI*Math.pow(radius,3);


        System.out.println("The lenght of hypotteneous side 'C' : "+c+ "cm" );
        System.out.println("The circumference is "+circumference);
        System.out.println("The area is "+area+ "cm²");
        System.out.println("The volume is "+volume);



        scanner.close();
//
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
//
//        result=Math.pow(3,2);
//        result=Math.sqrt(3);
//        result=Math.ceil(3.14);
//        result=Math.floor(3.99);
//        result=Math.abs(-45);
//        result=Math.max(12,34);
//        result=Math.min(12,45);
//
//        System.out.println(result);
    }
}
