public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        
        Map<Character, int[]> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.get(s.charAt(i))[0]++;
            } else {
                map.put(s.charAt(i), new int[]{1,0});
            }
            if (map.containsKey(t.charAt(i))) {
                map.get(t.charAt(i))[1]++;
            } else {
                map.put(t.charAt(i), new int[]{0,1});
            }
        }
        
        for (int[] num : map.values()) {
            if (num[0] != num[1]) return false;
        }
        return true;
    }
}