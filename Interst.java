import java.util.Scanner;
public class Interst {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double principle;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principle : ");
        principle=scanner.nextDouble();
        System.out.print("Enter a rate : ");
        rate=scanner.nextDouble()/100;
        System.out.print("Enter the timesCompound : ");
        timesCompound=scanner.nextInt();
        System.out.print("Enter a year : ");
        years=scanner.nextInt();

        amount= principle*Math.pow(1+rate/timesCompound,timesCompound*years);





        System.out.printf("The amount after %d years %.2f ",years,amount);

        scanner.close();


    }
}
