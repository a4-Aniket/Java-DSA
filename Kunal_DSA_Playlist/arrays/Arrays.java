package Kunal_DSA_Playlist.arrays;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        //Input taking
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col< arr[row].length; col++ ){
                System.out.print("Enter the element of "+row+" row "+col+" column: ");
                arr[row][col] = in.nextInt();
            }
        }
        //Printing the array
        for(int row = 0; row<arr.length; row++){
            for(int col = 0 ; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }









    }

}
