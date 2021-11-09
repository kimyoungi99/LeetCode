class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        dfs(candidates, target, new ArrayList<Integer>(), 0, answer);
        return answer;
    }
    
    public void dfs(int[] candidates, int target, List<Integer> cur, int index, List<List<Integer>> answer) {
        if(getSum(temp) == target) {
            answer.add(temp);
        }
        if(getSum(temp) > target)
            return;
        
        for(int i = index; i < candidates.length; i++) {
            temp.add(candidates[i]);
            dfs(candidates, target, temp, i, answer);
            temp.remove(temp.size() - 1);
        }
        return;
    }
    
    public int getSum(List<Integer> cur) {
        return cur.stream().mapToInt(i -> i).sum();
    }
}