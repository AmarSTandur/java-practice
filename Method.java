import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Method {
    public static void main(String[] args){
        String name ="Amar";
        int age =21;
        System.out.println(getname("Amar","Tandur"));


        System.out.println(sum(3,4));;
        HappyBirhtday(name,age);
        HappyBirhtday(name,age);
        System.out.println(cube(4));

    }
    static void HappyBirhtday(String a,int b){
        System.out.printf("Happy Birthday %s!\n" ,a );
        System.out.printf("God bless you ,and you are %d years old \n",b);

    }
    static double cube(int num){
        return num=num*num;
    }

    static int sum(int num,int num1){
        return num+num1;

    }
    static String getname(String a,String b){
        return a+" "+b;
    }

}
