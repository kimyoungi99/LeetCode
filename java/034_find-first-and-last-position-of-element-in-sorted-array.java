class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{frontSearch(nums, target), lastSearch(nums, target)};
    }
    
    public int frontSearch(int[] nums, int target) {
        int answer = -1;
        int start = 0, end = nums.length - 1, search = target - 1;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                answer = mid;
                end = mid - 1;
            }
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return answer;
    }
    
    public int lastSearch(int[] nums, int target) {
        int answer = -1;
        int start = 0, end = nums.length - 1, search = target - 1;
        
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                answer = mid;
                start = mid + 1;
            }
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return answer;
    }
}