import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double temperature;
        double newtemp;
        String unit;

        System.out.print("Enter the Temperature : ");
        temperature=scanner.nextDouble();

        System.out.print("Convert the Temperature to Celsius or Fahrenheit ? ( C / F ) : ");
        unit=scanner.next().toUpperCase();

        newtemp=(unit.equals("C"))? ((temperature-32)*5/9):((temperature*9/5)+32);

        System.out.printf("%.2f°%s",newtemp,unit );


        scanner.close();
    }

}
