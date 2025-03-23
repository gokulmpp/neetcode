package array;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<=nums.length-1;i++)
        {
            if(nums[i]==nums[i-1])
            {
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate c=new ContainsDuplicate();
        int[] num={1,2,3,3};
        System.out.println(c.hasDuplicate(num));

    }


}