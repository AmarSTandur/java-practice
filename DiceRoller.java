import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        Random random =new Random();
        int numofdice;
        int total = 0;

        System.out.print("Enter the Number of Dice : ");
        numofdice=scanner.nextInt();
        if (numofdice>0) {
            for(int i=0;i<numofdice;i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("you rolled " + roll);
                total += roll;
            }
            System.out.println("Total : "+total);

        } else {


            System.out.println("Number of dice must be greater than 0 ");
        }
        scanner.close();




    }
    static void printDie(int roll){
        String Dice1= """
                 --------
                |        |
                |   ●    |
                |        |
                 --------
                """;
        String Dice2= """
                 --------
                | ●      |
                |        |
                |     ●  |
                 --------
                """;
        String Dice3= """
                 --------
                | ●      |
                |   ●    |
                |     ●  |
                 --------
                """;
        String Dice4= """
                 --------
                | ●    ● |
                |        |
                | ●    ● |
                 --------
                """;
        String Dice5= """
                 --------
                | ●    ● |
                |    ●   |
                | ●    ● |
                 --------
                """;
        String Dice6= """
                 --------
                | ●    ● |
                | ●    ● |
                | ●    ● |
                 --------
                """;

        switch (roll){
            case 1-> System.out.println(Dice1);
            case 2-> System.out.println(Dice2);
            case 3-> System.out.println(Dice3);
            case 4-> System.out.println(Dice4);
            case 5-> System.out.println(Dice5);
            case 6-> System.out.println(Dice6);
            default -> System.out.println("INVALID ROLL");
        }
    }


}
