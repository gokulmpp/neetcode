package array;

import java.util.HashMap;

public class MajorElements {
    public static void major(int[] nums) {
        /*int count = 1;
        int candidates = nums[0];
        for(int i=1;i<nums.length;i++){
            if(count==0){
                candidates=nums[i];
            }
            if(candidates==nums[i]){
                count++;
            }
            else
                count--;
        }
        return count;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            }
            else
                map.put(num,1);
        }
        System.out.println(map);
    }

    */

        int majority = nums[0];
        int vote =1;
        for(int i=1;i< nums.length;i++){

            if(nums[i]==majority){
                vote++;
            }
            else
                vote--;
            if(vote==0){
                majority=nums[i];
                vote=1;
            }
        }
        System.out.println(majority);

    }

    public static void main(String[] args) {
            int[] num = {2,2,3,4,1,2,3,2,3,4,1,2,4,5,3,3,3};
            major(num);
    }
}
