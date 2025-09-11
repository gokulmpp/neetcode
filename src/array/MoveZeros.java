package array;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums){
        int insertPosition = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                nums[insertPosition]=nums[i];
                insertPosition++;

            }

        }while(insertPosition<nums.length)
            nums[insertPosition++]=0;
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int a[]={0,1,0,3,12};
        MoveZeros m=new MoveZeros();
        m.moveZeroes(a);
    }
}
