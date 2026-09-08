//import java.util.Arrays;
//import java.util.Scanner;
//public class Array {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//
//        String[] fruits={};
//        int size;
//        System.out.print("Enter the size of the array: ");
//        size=scanner.nextInt();
//        scanner.nextLine();
//
//
//        fruits=new String[size];
//
//
//        for(int i =0;i<fruits.length;i++){
//            System.out.print("Enter a fruit name : ");
//            fruits[i]=scanner.nextLine();
//
//
//
//        }
//        Arrays.sort(fruits);
//        for(String fruit:fruits){
//            System.out.println(fruit);
//        }
//        scanner.close();
//    }
//}


import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String[] fruits = {"apple","orange","mango","banana"};
        System.out.print("Enter a fruit name to search : ");
        String target = scanner.nextLine();
        boolean isFound = false;

        for (int i = 0; i < fruits.length; i++) {
            if (target.equals(fruits[i])) {
                System.out.println("The Element found at index : " + i);
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println("the Element is not found");
        }
        scanner.close();
    }

}