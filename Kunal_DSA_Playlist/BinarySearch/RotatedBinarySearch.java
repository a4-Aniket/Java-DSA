package Kunal_DSA_Playlist.BinarySearch;

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
        //case 1
        if(arr[pivot] == target){
            return pivot;
        }
        //case 2
        else if(target >= arr[0]){
            return binarySearch(arr, target, 0 , pivot -1);
        }
        //case 3
        //target < start  so simply search in the second half of array i.e, from (pivot + 1 to end) bcoz all
        //elements from start till pivot are going to be > target
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
            //case 1
            //checked mid< end to make sure that we don't get index out of bound error
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid; // found the ans
            }
            //case 2
            else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            //case 3
            //all elements after mid are < start so we are ignoring all those elements by taking only the elements before mid
            else if( arr[mid] <= arr[start]){
                end = mid - 1;
            }
            //case 4
            //if mid was the pivot it would be caught above so definitely more
            // bigger number exists after the mid so we are searching in the second part of the array so searching after the mid
            //therefore start = mid + 1
            else{
                //if start is < middle element
                start = mid + 1;
            }
        }
        return -1;
    }
}
