package Kunal_DSA_Playlist.LinearSearch;

import java.util.Scanner;
import java.util.Arrays;
public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//Asking no of rows from user
        System.out.print("Enter no of rows: ");
        int row = in.nextInt();
        int[][] arr = new int[row][];
//Asking no of columns from the user
        for(int i = 0; i<row; i++ ){
            System.out.print("Enter the no of column in "+i+" row: ");
            arr[i] = new int[in.nextInt()];
        }
//Taking input of array elements
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter the "+i+" row "+j+" column element: ");
                arr[i][j] = in.nextInt();
            }
        }
//Displaying the 2D array
        System.out.println("The 2D array is: ");
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                System.out.print (arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter element to search: ");
        int target = in.nextInt();
        int[] result = searchIn2D(arr,target);
        System.out.println("Element found at "+ Arrays.toString(result));

        int maxelement = maxInArr(arr);
        System.out.println("The maximum element in the array is: "+maxelement);


    }
    static int[] searchIn2D(int[][] arr, int target){
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int maxInArr(int[][] arr){
        int max = arr[0][0];
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];

                }
            }
        }
        return max;
    }
}
