class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int res = 0;
        while(left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            
            if(height[left] > height[right]) {
                if(rightMax - height[right] > 0) res += rightMax - height[right];
                right--;
                
            }else {
                if(leftMax - height[left] > 0) res += leftMax - height[left];
                left++;
                
            }
        }
        return res;
    }
}