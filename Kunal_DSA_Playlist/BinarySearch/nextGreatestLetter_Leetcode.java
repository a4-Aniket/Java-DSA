package Kunal_DSA_Playlist.BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
import java.util.Scanner;
public class nextGreatestLetter_Leetcode {
    public static void main(String[] args) {
        char[]  arr = {'c', 'f', 'j'};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element : ");
        char target = in.next().trim().charAt(0);
        System.out.println(nextGreatestLetter(arr, target));

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target< letters[mid]){
                end = mid -1;
            }
            else {
                start = mid +1;
            }

        }
        return letters[start % letters.length];

    }
}
