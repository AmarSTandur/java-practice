//import javax.script.ScriptContext;
//import java.util.Scanner;
//
//public class Forloop {
//    public static void main(String[] args) throws InterruptedException {
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("How much you wants to count down the time : ");
//        int start=scanner.nextInt();
//
//
//        for(int i=start;i>0;i--){
//            System.out.println(i);
//            Thread.sleep(200);
//        }
//        System.out.println("Happy Birthday!❤️❤️🫂🫂🫂❤️❤️");
//
//        scanner.close();
//    }
//}
//
//



public class Forloop {
    public static void main(String[] args){

        for(int i =1;i<=10;i++){
            if(i==8){
                continue;
            }
            else if(i==9){
                break;
            }
            else {
                System.out.print(i + " ");
            }
        }

    }
}
