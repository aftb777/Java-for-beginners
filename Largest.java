// Brute force method

import java.util.Arrays;

public class Largest{
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-1];
    }
    public static void main(String[] args) {
        int[] arr1 = {8,9,1,2,6,0};
        System.out.println("Largest Element : " + majorityElement(arr1));
    }
}

// Optimize Solution

// import java.util.*;
// public class tuf {
 
//   public static void main(String args[]) {
 
//     int arr1[] =  {2,5,1,3,0};
//     System.out.println("The Largest element in the array is: "+findLargestElement(ar
//     r1));
 
//     int arr2[] =  {8,10,5,7,9};
//     System.out.println("The Largest element in the array is: "+findLargestElement(ar
//     r2));
//   }
//   static int findLargestElement(int arr[]) {
//     int max= arr[0];
//     for (int i = 0; i < arr.length; i++) {
//       if (arr[i] > max) {
//         max= arr[i];
//       }
//     }
//     return max;
//   }
// }
