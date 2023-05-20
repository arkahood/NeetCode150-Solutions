/*
link - https://leetcode.com/problems/valid-anagram/
time complexity - O(n)
space complexity - O(1)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        for(char ch : s.toCharArray()){
            map[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            map[ch-'a']--;
        }
        for(int i : map){
            if(i != 0) return false;
        }
        return true;
    }
}

class ValidAnagrams {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String s1 = "rat", t1 = "car";
        System.out.println(new Solution().isAnagram(s, t));
        System.out.println(new Solution().isAnagram(s1, t1));
    }
}