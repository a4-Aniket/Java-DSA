package Kunal_DSA_Playlist;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower limit : ");
        int lower = input.nextInt();
        System.out.println("Enter upper limit: ");
        int upper = input.nextInt();

        System.out.print("Armstrong numbers between "+lower+" and "+upper+" are:  ");
        for(int i = lower; i<=upper; i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isArmstrong(int n){            //To check whether armstrong or not
        int original = n;
        int sum = 0;
        int digits = countdigits(n);
        while(n >0){
            int rem = n%10;
            n = n/10;
            sum = sum + powerRem(rem, digits) ;
        }
        return sum == original;
    }

    static int powerRem(int rem, int digits){              //To calculate the rem^digits
        int result = 1;
        for(int i = 0; i<digits ; i++){
            result = result *rem;
        }
        return result;
    }

    static int countdigits(int n){       //To count digits of the number
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
}
