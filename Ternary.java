import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Ternary {
    public static void main(String[] args){

        int age=20;

        String able=(age >= 18)? "notvote": "vote";
        System.out.println(able);



        int Marks=5;

        String PassorFail=(Marks>=65)? "Passed": "Fail";
        System.out.println(PassorFail);



        int amount=80000;
        double Tax= (amount>6500)?0.23:0.14;
        System.out.println(Tax);

    }
}
