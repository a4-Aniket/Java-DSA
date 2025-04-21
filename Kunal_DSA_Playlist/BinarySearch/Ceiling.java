package Kunal_DSA_Playlist.BinarySearch;

//Ceiling of a number gives the smallest no larger than the target (simply the upper int value)
import java.util.Scanner;
public class Ceiling {
    public static void main(String[] args) {
        float[] arr = {1,4,6,8,10,12,15};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float no = in.nextFloat();
        float ceiling = arr[ceiling(arr, no)];
        System.out.println("The ceiling of "+no+" is : "+ceiling);
    }
    static int ceiling(float[] arr, float target){
//if the target is greater than the greatest no in the array
        if(target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid=0;
        while(start<= end){
            mid = start + (end-start)/2;
            if(target< arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return start;
    }

}
