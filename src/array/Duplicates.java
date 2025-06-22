package array;

import java.util.HashSet;

public class Duplicates {
    public int Dup(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++) {
            set.add(nums[i]);
        }
       System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {1,1,3,4,5,3};
        Duplicates d= new Duplicates();
        int count = d.Dup(nums);
        System.out.println(count);
    }
}
