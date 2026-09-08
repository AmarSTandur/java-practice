import java.util.Random;
public class Random123 {
    public static void main(String[] args){

        double num1;
        int num2;
        int num3;
        boolean isHead;

        Random random=new Random();
        isHead=random.nextBoolean();
        if(isHead){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }



        num1=random.nextDouble(1,2);
        num2=random.nextInt(1,101);
        num3=random.nextInt(1,101);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


    }
}

