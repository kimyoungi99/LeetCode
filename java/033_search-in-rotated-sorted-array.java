class Solution {
    public int search(int[] nums, int target) {
        return  customBinarySearch(nums, target);
    }

    public int customBinarySearch(int[]nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;

        if(target > nums[end] && target < nums[start])
            return -1;

        while(start <= end) {
            mid = (start + end) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[start] < nums[end])
                return binarySearch(nums, target, start, end);
            if(end - start + 1 <= 3)
                return naiveSearch(nums, target, start, end);
            if(nums[start] < nums[mid]) {
                if(target < nums[start] || target > nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else {
                if(target > nums[mid] && target < nums[start])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[]nums, int target, int start, int end) {
        int mid = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            if(nums[mid] == target)
                return mid;

            if(target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public int naiveSearch(int[]nums, int target, int start, int end) {
        for(int i = start; i <= end; i++)
            if(nums[i] == target)
                return i;
        return -1;
    }
}