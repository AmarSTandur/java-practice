//
//
//public class IIILP {
//    public static void main(String[] args){
//        String s="(())";
//        int balance =0;
//        for(int i =0;i<s.length();i++){
//            char ch =s.charAt(i);
//            if(ch=='('){
//                balance++;
//            }else if(ch==')'){
//                balance--;
//            }
//            if(balance<0){
//                break;
//
//        }
//
//        }
//
//
//
//    }
//
//}


////Missing code Binary Search
//public class IIILP {
//   public static void main(String[] args) {
//       int[] arr ={2,5,8,12,16,23,68};
//       int target =16;
//       int left=0,right=arr.length-1;
//       while(left<=right){
//           int mid=left+(right-left)/2;
//           if(arr[mid]==target){
//               System.out.println(mid);
//               break;
//
//           }
//           else if(arr[mid]<target){
//               left=mid+1;
//
//           }
//           else{
//               right=mid-1;
//           }
//
//       }
//
//
//   }
//
//   }


//
////program output arr transformation
//import java.util.Arrays;
//public class IIILP {
//    public static void main(String[] args){
//        int[] a={3,1,4,2,5};
//        for (int i=0;i<a.length-1;i++){
//            a[i]=a[i]+a[i+1];
//
//        }
//
//            System.out.print(Arrays.toString(a));
//    }
//
//}



//Jumbled Code -Move Zeroes
//public class IIILP{
//    public static void main(String[] args){
//        int[] nums = {0, 1, 0, 3, 12};
//        int pos = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[pos++] = nums[i];
//            }
//        }
//
//        for (int i = pos; i < nums.length; i++)
//            nums[i] = 0;
//        for (int x : nums)
//            System.out.print(x + " ");
//
//    }
//
//}


public class IIILP {
    public static void main(String[] args){
        String s = "swiss";
        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c]==1) {
                System.out.println(c);
                break;
            }
        }

    }
}




