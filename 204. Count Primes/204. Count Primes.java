public class Solution {
    public int countPrimes(int n) {
        boolean[] mark = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!mark[i]) {
                count++;
                if (i < Math.sqrt(n)) {
                    int k = i * i;
                    while(k < n) {
                        mark[k] = true;
                        k += i;
                    }
                }
            }    
        }
        
        return count;
    }
}