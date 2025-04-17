package Kunal_DSA_Playlist.arrays;
//Leetcode problem 1
//https://leetcode.com/problems/two-sum/description/
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = in.nextInt();
        int[] result = twosum(arr, target);
        System.out.println(result[0] +", "+result[1]);

    }
    static int[] twosum(int[] array, int value){
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i] + array[j] == value){
                    return new int[] {i,j};
                }

            }
        }
        return new int[] {-1,-1};


    }
}

