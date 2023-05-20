/*
 * Link - 
 * 
 * Time Complexity - O(N) - Avarage Case
 * Space Complexity - O(N)
 */

import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // Bucket
        List<Integer>[] l = new ArrayList[nums.length+1];
        // Map the Bucket
        // Bucket index -> frequncy, Index attaching list have that numbers
        // which frequncy ==index now just traverse in reverse
        for(int i : map.keySet()) {
            int val = map.get(i);
            if(l[val] == null) l[val] = new ArrayList<>();
            l[val].add(i);
        }
        int[] res = new int[k];
        int id=0;
        for(int i=l.length-1; i>=0;i--){
            if(l[i] != null) {
                for(int j : l[i]) {
                    res[id++] = j;
                    k--;
                    if(k <= 0) return res;
                }
            }
        }
        return res;
    }
}

class KfrequentElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,2,3};
        int k = 2;
        int[] res = new Solution().topKFrequent(arr,k);
        for(int i : res)
            System.out.print(i+" ");
    }
}