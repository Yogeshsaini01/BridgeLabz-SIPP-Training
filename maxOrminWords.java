package brijlab;
import java.util.*;

public class brijlab {
    public static void main(String[] args) {
        String[] arr = {"yogesh","anil","shubham","stop"};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minidx=0;
        int maxidx=0;

        for (int i=0; i<arr.length; i++) {
            if(arr[i].length()>max) {
                max = arr[i].length();
                maxidx = i;
            }
            if(arr[i].length()<min) {
                min=arr[i].length();
                minidx = i;
            }
        }

        System.out.println("Max length " + max + " name  " + arr[maxidx]);
        System.out.println("Min length " + min + " name " + arr[minidx]);
    }
}