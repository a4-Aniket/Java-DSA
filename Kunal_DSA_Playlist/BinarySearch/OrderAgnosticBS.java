package Kunal_DSA_Playlist.BinarySearch;

//here we can apply binary search in both the cases whether sorted in ascending or in descending order 
public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr1 = {76,54,34,23,11};
        int[] arr2 = {12,23,42,43,54};
        int target =54;
        int ans = orderagnosticBS(arr1,  target);
        System.out.println("The element is found at : "+ans+" index");

    }
    static int orderagnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
//Finding whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] <arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
//Common case for both ascending or descending
            if(arr[mid ] == target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if(target<arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}
