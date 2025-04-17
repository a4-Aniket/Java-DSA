package Kunal_DSA_Playlist.LinearSearch;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] array =  new int[size];

        for(int i = 0; i<size; i++){
            System.out.print("Enter the "+ i +"element of the array: ");
            array[i] = in.nextInt();
        }
//        for(int num : array){
//            System.out.print("Enter "+num+" element of array: ");
//            array[num] = in.nextInt();
//        }

        System.out.print("Enter element to search: ");
        int element = in.nextInt();

        int val = linear(array, element);
        if(val == -1){
            System.out.println("Given element is not present in the array");
        }
        else{
            System.out.println("Given element is present at the "+val+"th index of the array");
        }



    }
    static int linear(int[] arr, int  element){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }

        }
        return -1;

    }
}

