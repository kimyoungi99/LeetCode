class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<Integer>(), -1, set, 0);
        return new ArrayList<>(set);
    }
    
    public void dfs(int[] candidates, int target, List<Integer> cur, int index, Set<List<Integer>> set, int sum) {
        if(sum > target)
            return;
        if(sum == target) {
            set.add(new ArrayList<>(cur));
        }
        
        int prev=-1;
        for(int i = index + 1; i < candidates.length; i++) {
            if(prev != candidates[i]) {
                cur.add(candidates[i]);
                dfs(candidates, target, cur, i, set, sum + candidates[i]);
                cur.remove(cur.size() - 1);
                prev = candidates[i];
            }
        }
        return;
    }
}