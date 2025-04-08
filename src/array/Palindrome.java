package array;

import java.util.Arrays;

public class Palindrome {
    public void isPalindrome(String s) {
        char[] ss=s.toCharArray();
        Arrays.sort(ss);
        System.out.println(ss);
       /* for(int i=0;i<s.length();i++)
        {

        }*/
    }

    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        String s="Was it a car or a cat I saw";
        p.isPalindrome(s);
    }
}
