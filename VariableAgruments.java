public class VariableAgruments {
    public static void main(String[] args){

        System.out.println(add(1,2,3,4));
        System.out.println(avg(1,2,3,4));
    }

    static int add(int ...numbers){
        int sum=0;
        for(int number : numbers){
            sum+=number;
        }
        return sum;
    }
    static double avg(double...numbers){
        double sum=0;
        if(numbers.length==0){
            System.out.println("add some number to get average");
            return 0;

        }
        for(double number : numbers){
            sum+=number;
        }
        return sum/numbers.length;
    }
}
