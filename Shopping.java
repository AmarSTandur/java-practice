import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;
public class Shopping {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        String Currency="$";
        double total;

        System.out.print("Enter the item which you want to buy : ");
        item =scanner.nextLine();

        System.out.print("Enter the price of the item : ");
        price= scanner.nextDouble();

        System.out.print("Enter the number of quantities : ");
        quantity=scanner.nextInt();


        total=price*quantity;

        System.out.print("You have bought "+quantity+" of "+ item+"\n and this total price is "+Currency+total);






        scanner.close();

    }
}
