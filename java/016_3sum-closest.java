class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int answer = 0, min = 987654321;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while(start < end) {
                if(abs(target - (nums[i] + nums[start] + nums[end])) < min) {
                    min = abs(target - (nums[i] + nums[start] + nums[end]));
                    answer = nums[i] + nums[start] + nums[end];
                }
                if(target - (nums[i] + nums[start] + nums[end]) < 0)
                    end -= 1;
                else if(target - (nums[i] + nums[start] + nums[end]) > 0)
                    start += 1;
                else
                    return target;
            }
                
        }
        return answer;
    }
    
    public int abs(int a) {
        if(a < 0)
            return -a;
        return a;
    }
}