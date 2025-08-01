package array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=val) {
                nums[index]=nums[i];
                index++;
            }
        }for(int i=0;i<index;i++) {
            System.out.println(nums[i]);
        }
        System.out.println();
        return index;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2,4,5};
        RemoveElement s = new RemoveElement();
        s.removeElement(nums,1);
    }
}
