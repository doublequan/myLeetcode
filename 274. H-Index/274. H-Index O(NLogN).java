public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        
        Arrays.sort(citations);
        
        int h = citations.length;
        if (citations[0] >= h) return h;
        else h--;
        
        while (h > 0 && h < citations.length) {
            if (citations[citations.length - h] >= h && citations[citations.length - h - 1] <= h) {
                return h;
            }
            h--;
        }
        return h;
    }
}