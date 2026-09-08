import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){

        String[] questions= {"What is the main function of Router?",
                             "Which part of the computer considered the brain?",
                             "What year was Facbool Launched?",
                             "who is known as the father of computer",
                             "What was the first programong language?"};

        String[][] options={{"1.Storing files","2.Encrypting data","3.Directing internet traffic","4.Managing passward"},
                          {"1.CPU","2.Hard Driver","3.RAM","4.GPU"},
                          {"1.2000","2.2004","3.2006","4.2008"},
                          {"1.Steve Jobs","2.Bill Gates","3.Alan Turing","4.Charles Babbage"},
                          {"1.COBAL","2.C","3.Eortran","4.Assembly"}};

        int[] answer={3,1,2,4,3};
        int Guess;
        int score=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the JAVA Quiz Game!");
        System.out.println("******************************");

        for(int i=0;i< questions.length;i++){
            System.out.println(questions[i]);

            for(String  option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter Your Answer to the Question: ");
            Guess=scanner.nextInt();



            if(Guess==answer[i]){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
            }
            else{
                System.out.println("********");
                System.out.println(" Wrong! ");
                System.out.println("********");
            }
        }









        scanner.close();
    }
}

