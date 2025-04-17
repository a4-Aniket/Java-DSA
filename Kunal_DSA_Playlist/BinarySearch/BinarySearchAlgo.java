package Kunal_DSA_Playlist.BinarySearch;
public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {12,23,42,43,54};
        int target =54;
        int ans = binarysearch(arr,  target);
        System.out.println("The element is found at : "+ans+" index");
    }
    static int binarysearch(int[] arr, int target){
//int mid = (start + end)/2; might be possible that (start + end) exceed the range of int in java
        int start = 0;
        int end = arr.length -1;
        while(start <=end){
            int mid = start + (end - start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;  //loop overed means no value has been found that means the target doesn't exist
    }
}

