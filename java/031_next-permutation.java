class Solution {
    public void nextPermutation(int[] nums) {
        int indexA = nums.length - 2;
        while(indexA >= 0 && nums[indexA] >= nums[indexA + 1])
            indexA--;
        
        if(indexA != -1) {
            int indexB = nums.length - 1;
            while(nums[indexA] >= nums[indexB])
                indexB--;
            swapArrayElement(nums, indexA, indexB);
        }
        int start = indexA + 1, end = nums.length - 1;
        while(start < end) {
            swapArrayElement(nums, start, end);
            start++;
            end--;
        }
        
    }
    
    public void swapArrayElement(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
}