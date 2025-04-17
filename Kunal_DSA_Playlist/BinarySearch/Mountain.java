package Kunal_DSA_Playlist.BinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Mountain {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,5,3,2};
        int peak = peakIndexInMountainArray(arr);
        System.out.println("Peak element is at "+peak+" index");

    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end -start)/2;
            if(arr[mid] > arr[mid + 1]){
                //we are in decreasing part of aray;
                //this may be the ans , but look at left
                //this is why end ! = mid -1;
                end = mid;
            }
            else{
                //we are in ascending part of array
                start = mid + 1; // bcoz we know that mid + 1 element > mid element
            }
            //in the end start == end pointing to the largest number bcoz of the 2 checks
            //start and end are always trying to find the max element in the above 2 checks
            //hence, when they are pointing to just one element , that is the max element as that is what the checks says
            //more elaboration: at evey point of time for start and end, they have the best possible answer till that time
            // and if we are saying that only one item is remaining hence bcoz of the above line that is the best possible answer

        }
        return start; // we can return end aswell as start = end
    }
}
