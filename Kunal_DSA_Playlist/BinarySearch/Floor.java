package Kunal_DSA_Playlist.BinarySearch;

//This gives the floor of a number, that is the largest no smaller than the target
import java.util.Scanner;
public class Floor {
    public static void main(String[] args) {
        float[] arr = {1,4,6,8,10,12,15};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        float no = in.nextFloat();
        float floor = arr[floor(arr, no)];
        System.out.println("The floor of "+no+" is : "+floor);
    }
    static int floor(float[] arr, float target){
        int start = 0;
        int end = arr.length - 1;
//we don't need to check for case of target < smallest no in array bcoz end will automatically becomes -1 as the binary search go on         
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
        return end;
    }

}
