public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        if (citations[0] >= citations.length) return citations.length;
        

        int lo = 0, hi = citations.length - 1;
        int h = -1;
        while (lo <= hi) {
            h = (lo + hi) / 2;
            if (citations[h] >= citations.length - h) {
                hi = h - 1;
            } else {
                lo = h + 1;
            }
        }
        return citations.length - lo;
    }
}