package Kunal_DSA_Playlist.BinarySearch;
//This code is for the array contains no dublicate elements for non distinct elements in array this code will not work
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));

    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        //if you didn't find the pivot, it means the array is not rotated
        if(pivot == -1){
            //just do normal binary search as array is not rotated
            return binarySearch(arr, target, 0, arr.length -1);
        }
        //if pivot is found means that we have found 2 ascending sorted array
        //and here we have 3 cases
        if(arr[pivot] == target){
            return pivot;
        }
        else if(target >= arr[0]){
            return binarySearch(arr, target, 0 , pivot -1);
        }
        return binarySearch(arr, target, pivot +1, arr.length-1);

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target< arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid] ){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end -start)/2;
            //4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid; // found the ans
            }
            else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            else if( arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                //if start is < middle element
                start = mid + 1;
            }
        }
        return -1;
    }
}
