package Kunal_DSA_Playlist.LinearSearch;
//https://leetcode.com/problems/richest-customer-wealth/description/
//Leetcode problem 1672
public class MaximumWealth_Leetcode {
    public static void main(String[] args){
        int[][] account = {
            {2,4,32},
            {12,5,6},
            {4,10,8}
        };
        int maximum_balance = maximumWealth(account);
        System.out.println("The maximum balance is: "+maximum_balance);

    }
    static int maximumWealth(int[][] accounts){
//person = rows = i
//account = columns = j
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowsum = 0;
            for (int i : account) {
                rowsum = rowsum + i;
            }
            //now we have the sum of accounts of person
            // so now check if overall ans
            if (rowsum > ans) {
                ans = rowsum;
            }
        }
        return ans;

    }

}
