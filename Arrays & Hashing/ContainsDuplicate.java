/*
question link - https://leetcode.com/problems/contains-duplicate/description/
time complexity - O(n)
space complexity - O(n)
*/

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}

class containsDuplicate{
    public static void main(String[] args) {
        int [] num;
        num = new int[]{22,33,44,55,22};  
        System.out.println(new Solution().containsDuplicate(num));
    }
}