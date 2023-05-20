/*
link - https://leetcode.com/problems/group-anagrams/
*/
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams (String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortS = new String(ch);
            if(!map.containsKey(sortS)) map.put(sortS, new ArrayList<>());
            map.get(sortS).add(s);
        }
        int k = 0;
        for(String s : map.keySet()) {
            res.add(new ArrayList<>());
            for(String s1 : map.get(s)) res.get(k).add(s1);
            k++;
        }
        return res;
    }
}
class GroupAnagram {
    public static void main (String[] args) {
        String[] s = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(new Solution().groupAnagrams(s));
    }
}