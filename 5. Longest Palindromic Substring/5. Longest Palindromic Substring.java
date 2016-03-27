public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) return s;
        
        
        String res = "";
        
        for (int i = 0; i < s.length(); ) {
            
            int k = i, j = i;
            
            while (j < s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) {
                j++;
            }
            
            i = j + 1;
            
            while (k >= 0 && j < s.length() && s.charAt(k) == s.charAt(j)) {
                k--;
                j++;
            }
            
            if (s.substring(k + 1, j).length() > res.length()) {
                res = s.substring(k + 1, j);
            }
            
            
            //System.out.println(i);
        }
        return res;
    }   
}