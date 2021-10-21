class Solution {
    public int maxArea(int[] height) {
        int max = 0, start = 0, end = height.length - 1;
        while(start < end) {
            if(max < area(start, end, height))
                max = area(start, end, height);
            if(height[start] > height[end])
                end--;
            else
                start++;
        }
        return max;
    }
    
    public int area(int i, int j, int[] height) {
        return (j - i) * min(height[i], height[j]);
    }
    
    public int min(int a, int b) {
        if(a < b)
            return a;
        return b;
    }
}