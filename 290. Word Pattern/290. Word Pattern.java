public class Solution {
    public boolean wordPattern(String pattern, String str) 
    {
        String[] s = str.split(" ");
        if (pattern.length() != s.length)
            return false;
        Map<Character, String> map = new HashMap();
        Map<String, Character> map2 = new HashMap();
        for (int i = 0; i < s.length; i++)
        {
            if (map.containsKey(pattern.charAt(i)))
            {
                if (!map.get(pattern.charAt(i)).equals(s[i]))
                {
                    return false;
                }
            }
            else
            {
                map.put(pattern.charAt(i), s[i]);
            }
            
            if (map2.containsKey(s[i]))
            {
                if (!map2.get(s[i]).equals(pattern.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                map2.put(s[i], pattern.charAt(i));
            }
   
        }
        return true;
        
    }
}