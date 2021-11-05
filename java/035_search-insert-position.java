class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target);
    }
    
    public int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}