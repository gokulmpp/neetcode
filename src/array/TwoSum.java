package array;
public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && i!=j)
                {
                    return new int[]{i,j};
                }
            }
        }return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        int target=3;
        TwoSum s=new TwoSum();
        int[] result=s.twoSum(nums,target);
        if(result.length>0)
        {
            System.out.println("Indexes: [" +result[0] + ","+result[1]+"]");
        }
    }
}
