public class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) return false;
        
        Set<Integer> set = new HashSet();
        set.add(n);
        while (n != 1) {
            n = splitAndSquare(n);
            if (set.contains(n)) return false;
            else set.add(n);
            System.out.println(n);
        }
        return true;
    }
    
    private int splitAndSquare(int n) {
        int res = (n % 10) * (n % 10);
        while (n > 9) {
            n /= 10;
            res += (n % 10) * (n % 10);
        }
        return res;
    }
}