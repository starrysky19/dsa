/*
 * Write a recursive function that takes an array arr of integers and modifies it in place such that each element at index i becomes the sum of all elements from index 0 to i.
 * Example:
Input:
[1, 2, 3, 4, 5, 6]

Output:
[1, 3, 6, 10, 15, 21]
 * 
 */


package recursion;

import java.util.Arrays;

public class ModifyArraySum {
    public static void modify(int[] arr, int index){
        if(index==0)return;
        modify(arr, index-1);
        arr[index]+=arr[index-1];
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        modify(arr, arr.length-1);
        System.out.println("The modified array is: "+ Arrays.toString(arr) );
    }
}
