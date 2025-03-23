package array;

import java.util.Scanner;


    import java.util.Arrays;
import java.util.Scanner;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class IsAnagram {
        public boolean isAnagram(String s, String t) {
            char[] sArray=s.toCharArray();
            char[] tArray=t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            if(s.length()!=t.length())
            {
                return false;
            }
            return Arrays.equals(sArray, tArray);

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s= sc.next();
            String t=sc.next();
            IsAnagram a=new IsAnagram();
            System.out.println(a.isAnagram(s,t));
        }
    }

