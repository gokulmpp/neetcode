package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnagram {
    public void groupAnagrams(String[] strs) {

        for (int i = 0; i < strs.length; i++) {
            char[] carr = strs[i].toCharArray();
            Arrays.sort(carr);
            System.out.println(carr);
            strs[i] = String.copyValueOf(carr);
        }
        System.out.println(Arrays.toString(strs));


    }

    public static void main(String[] args) {
        List<List<String>> result=new ArrayList<>();
        String[] strs ={"act","pots","tops","cat","stop","hat"};

                GroupAnagram s=new GroupAnagram();
                s.groupAnagrams(strs);
    }
}
