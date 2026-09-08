//public class OverloadedMethod {
//    public static void main(String[] args){
//
//        System.out.println(sum(1,2));
//        System.out.println(sum(1,2,3));
//        System.out.println(sum(1,2,3,4));
//
//
//    }
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }
//
//}


public class OverloadedMethod{
    public static void main(String[] args){
        String tea=Baketea("ginger","strong");
        System.out.println(tea);


    }
    static String Baketea(String tea ){
         return tea + "  tea is super";
    }
    static String Baketea(String tea ,String special ){
        return tea + " " + special + "  tea is super";
    }
}