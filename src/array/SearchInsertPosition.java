package array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums,int target) {
        int i;
        for ( i = 0; i < nums.length; i++) {
            if (nums[i] == target) break ;
        }return i;
    }
    public static void main(String[] args) {
        int[] num={1,3,5,6};
        int target = 5;
        SearchInsertPosition s = new SearchInsertPosition();

        System.out.println(s.searchInsert(num,target));
    }
}
