package Kunal_DSA_Playlist.LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/


public class Leetcode {
    public static void main(String[] args) {
        int[] nums = {12,124,42,1,432,3456,32,221};
        System.out.println(findNumbers(nums));


    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int i =0; i<nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;

    }
    static boolean even(int nums){
        int count = 0;
        //finding the number of digits
        while(nums>0){
            count++;
            nums =  nums/10;
        }

        if(count<0){
            count = count*-1;
        }
        //telling if its even or not
        return count%2 ==0;


    }
}
