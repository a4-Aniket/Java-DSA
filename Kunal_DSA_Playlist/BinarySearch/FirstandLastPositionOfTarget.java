package Kunal_DSA_Playlist.BinarySearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;
public class FirstandLastPositionOfTarget {
    public static void main(String[] args){

        int[] nums = {1,2,4,5,7,7,7,8,5};
        int[] OutputArr = {-1,-1};
        int target = 7;
        OutputArr[0] = search(nums,target, true);
        OutputArr[1] = search(nums, target, false);
        System.out.println(Arrays.toString(OutputArr));


    }
    static int search(int[] nums, int target, boolean FindFirstOccurance){
//Initially taking the ans -1
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid] ){
                end = mid -1;
            }
            else if( target> nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(FindFirstOccurance){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;


    }
}