import java.util.Scanner;

public class Weightconverter {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to Weight Converter Program ");
        System.out.println("1 : Enter the Weight to convert KGS to LBS");
        System.out.println("2 : Enter the Weight to convert LBS to KGS");


        System.out.print("Enter your Choice : ");
        choice=scanner.nextInt();

        if(choice==1){
            System.out.print("Enter the weight in KGS : ");
            weight=scanner.nextDouble();
            newWeight =weight*0.453592;
            System.out.printf("New weight in LBS is %.2f",newWeight);

        }
        else if(choice==2){
            System.out.print("Enter the weight in LBS : ");
            weight=scanner.nextDouble();
            newWeight =weight*2.20462;
            System.out.printf("New weight in KGS is %.2f",newWeight);
        }






        scanner.close();
    }
}
