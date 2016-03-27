public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;
        
        int max = 0, cur = 0;
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) 
             && (i - map.get(s.charAt(i)) <= cur)) {
                cur = i - map.get(s.charAt(i)) - 1;
                //map.put(s.charAt(i), i)
            }
            map.put(s.charAt(i), i);
            cur++;
            if (cur > max) max = cur;
            
        }
        return max;
        
    }
}