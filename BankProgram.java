import java.util.Scanner;

public class BankProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        double balance=0;
        boolean isRunning = true;
        int choice;


        while (isRunning){
            System.out.println("**************************");
            System.out.println("BANK PROGRAM");
            System.out.println("**************************");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("**************************");

            System.out.print("Enter Your Choice (1-4) : ");
            choice =scanner.nextInt();

            switch (choice){
                case 1-> ShowBalence(balance);
                case 2->balance+=Deposite();
                case 3->balance-=Withdraw(balance);
                case 4->isRunning=false;
                default -> System.out.println("INVALID CHOICE!");
            }
            System.out.println("Thank You! For visiting  banking Website");
        }
        scanner.close();


    }
    static void ShowBalence(double balance){
        System.out.printf("%.2f\n",balance);

    }
    static double Deposite(){
        double amount;
        System.out.println("**************************");

        System.out.print("Enter amount to Deposite : ");

        amount=scanner.nextDouble();
        if(amount<0){
            System.out.println("**************************");
            System.out.println("Amount can't be Negative!");
            System.out.println("**************************");
            return 0;
        }
        else{
            return amount;
        }


    }
    static double Withdraw(double balance){
        double amount;
        System.out.println("**************************");
        System.out.print("Enter amount to withdraw : ");

        amount=scanner.nextDouble();
        if(amount>balance){
            System.out.println("**************************");
            System.out.println("INSUFFICIENT BALANCE");
            System.out.println("**************************");
            return 0;

        }

        else if(amount<0){
            System.out.println("**************************");
            System.out.println("Amount can't be Negative!");
            System.out.println("**************************");
            return 0;

        }
        else{
            return amount;
        }


    }

}
