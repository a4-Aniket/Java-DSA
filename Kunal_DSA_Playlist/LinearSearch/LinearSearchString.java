package Kunal_DSA_Playlist.LinearSearch;
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inString = in.next();
        System.out.print("Enter a element to search in the string: ");
        char target = in.next().trim().charAt(0);
        int result = search(inString,target);
        System.out.println("The element is at "+result+" index");
    }

    static int search(String input, char target){
        if(input.length()== 0){
            return -1;
        }
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)==target){
                return i;
            }

        }
        return -1;

    }
}
