package array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] num1,int m,int[] num2,int n) {
        int count =0;
        for(int i=m;i< num1.length;i++){
            num1[i] = num2[count];
            count++;
        }
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));
    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[] num1 = new int[m+n];
        int[] num2 = new int[n];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num2[0] =2;
        num2[1] =5;
        num2[2] =6;
        merge(num1,m,num2,n);
    }
}
