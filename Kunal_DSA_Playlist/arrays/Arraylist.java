package Kunal_DSA_Playlist.arrays;

import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<Integer>();
        vector.add(12);
        vector.add(13);
        vector.add(14);
        vector.add(15);
        vector.add(16);
        vector.add(17);
        vector.add(18);
        System.out.println(vector);
        vector.set(2, 123);
        System.out.println(vector);
    }
}
