public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        int count[] = new int[citations.length + 1];
        for (int i : citations) {
            if (i <= citations.length) count[i]++;
            else count[citations.length]++;
        }
        int h = citations.length;
        int sum = count[h];
        while (sum < h) {
            h--;
            sum += count[h];
        }
        return h;
    }
}