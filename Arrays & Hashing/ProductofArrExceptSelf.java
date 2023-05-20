/*
 * link - https://leetcode.com/problems/product-of-array-except-self/
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i=1;i<nums.length;i++){
            res[i] = res[i-1] * nums[i-1];
        }
        int temp = 1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = res[i] * temp;
            temp *= nums[i];
        }
        return res;
    }
}
class productofArrExceptSelf {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int[] ans = new Solution().productExceptSelf(arr);
        for(int i: ans) System.out.print(i+" ");
    }
}