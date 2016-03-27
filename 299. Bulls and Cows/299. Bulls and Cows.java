public class Solution {
    public String getHint(String secret, String guess) {
        
        int bull = 0, cow = 0;
        int[] record = new int[10];
        
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            }
            else {
                if (record[guess.charAt(i) - '0'] > 0) cow++;
                record[guess.charAt(i) - '0']--;
                if (record[secret.charAt(i) - '0'] < 0) cow++;
                record[secret.charAt(i) - '0']++;
            }
        }
        return bull + "A" + cow + "B";
    }
}