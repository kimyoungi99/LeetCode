class Solution {
    public int removeElement(int[] nums, int val) {
        int answer = 0;
        for(int i = 0; i < nums.length && nums[i] != -123123; i++) {
            if(nums[i] == val) {
                deleteOneAndArrangeArray(nums, i);
                i--;
            }
            answer = i;
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