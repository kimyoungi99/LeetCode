class Solution {
    public int removeDuplicates(int[] nums) {
        int prevNum = -123123, answer = 0;
        
        for(int i = 0; i < nums.length && nums[i] != -123123 ; i++) {
            if(nums[i] == prevNum) {
                deleteOneAndArrangeArray(nums, i);
                i--;
            }
            answer = i;
            prevNum = nums[i];
        }
        return answer + 1;
    }
    
    public void deleteOneAndArrangeArray(int[] nums, int index) {
        for(int i = index; i < nums.length - 1; i++)
            nums[i] = nums[i + 1];
        nums[nums.length - 1] = -123123;
        return;
    }
}