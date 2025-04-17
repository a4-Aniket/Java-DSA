package Kunal_DSA_Playlist.LinearSearch;
//Here everything is same as LinearSearchString the only difference is we
// have a start of range and a end of range and the loop runs between start and end only
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchString_inRange{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inString = in.next();
        System.out.print("Enter a element to search in the string: ");
        char target = in.next().trim().charAt(0);
        System.out.print("Enter the start of the range in which searching will be done: ");
        int start = in.nextInt();
        System.out.print("Enter the end of the range in which searching will be done: ");
        int end = in.nextInt();

        int result = search(inString,target,start,end);
        System.out.println("The element is at "+result+" index");
    }

    static int search(String input, char target, int start, int end){
        if(input.length()== 0){
            return -1;
        }
        for(int i=start; i<end; i++){
            if(input.charAt(i)==target){
                return i;
            }

        }
        return -1;

    }
}
