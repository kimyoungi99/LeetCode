class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Map<String, Boolean> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
            for(int j = i + 1; j < nums.length - 2; j++) {
                if(map.get(Integer.toString(nums[i]) + " " + Integer.toString(nums[j])) != null)
                    continue;
                int start = j + 1, end = nums.length - 1;
                while(start < end) {
                    if(target - (nums[i] + nums[j] + nums[start] + nums[end]) > 0)
                        start++;
                    else if(target - (nums[i] + nums[j] + nums[start] + nums[end]) < 0)
                        end--;
                    else {
                        map.put(Integer.toString(nums[i]) + " " + Integer.toString(nums[j]), true);
                        answer.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[start], nums[end])));
                        while(start < end && nums[start] == nums[start + 1])
                            start++;
                        while(start < end && nums[end] == nums[end - 1])
                            end--;
                        start++;
                        end--;
                    }
                }
            }
        }
        
        return answer;
    }
    
    public int abs(int a) {
        if(a > 0)
            return a;
        return -a;
    }
}