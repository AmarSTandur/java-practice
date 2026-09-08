//public class Array2D {
//    public static void main(String[]args){
//
//        String[][] gloceries={{"apple","banana","mango"},
//                              {"coconut","cucumber","brinjal"},
//                              {"potato","onion","chicken"}};
//        gloceries[0][0]="pineapple";
//
//        for(String[] foods:gloceries){
//            for(String food:foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//
//        }
//    }
//}


public class Array2D {
    public static void main(String[] args){

        char[][] phno={{'1','2','3'},
                       {'4','5','6'},
                       {'7','8','9'},
                       {'*','0','#'}};

        for(char[] nums:phno){
            for(char num:nums){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }
}