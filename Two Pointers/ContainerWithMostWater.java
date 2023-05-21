/*
 * link - https://leetcode.com/problems/container-with-most-water/
 */
class Solution {
    public int maxArea(int[] height) {
        int width = height.length-1;
        int l = 0;
        int r = height.length-1;
        int res = Integer.MIN_VALUE;
        while( l < r ){
            int currMinHei = Math.min(height[l],height[r]);
            int tempRes = width * currMinHei;
            res = Math.max(res, tempRes);
            width--;
            if(height[l] > height[r]) r--;
            else l++;
        } 
        return res;
    }
}