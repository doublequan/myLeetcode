public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList();
        Map<String, List> map = new HashMap();
        Arrays.sort(strs);
        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.copyValueOf(c);
            if (map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                List<String> l = new ArrayList();
                l.add(s);
                map.put(sorted, l);
                list.add(l);
            }
        }
        
        return list;
    }
}