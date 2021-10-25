class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int start = i + 1, end = nums.length - 1;
            
            while(start < end) {
                int target = nums[i] + nums[start] + nums[end];
                
                if(target < 0)
                    start += 1;
                else if(target > 0)
                    end -= 1;
                else {
                    answer.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[start], nums[end])));
                    
                    while(start < end && nums[start] == nums[start + 1])
                        start +=1;
                    while(start < end && nums[end] == nums[end - 1])
                        end -= 1;
                    start += 1;
                    end -= 1;
                }
            }
            
        }
        return answer;
    }
}