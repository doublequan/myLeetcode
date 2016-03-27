/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if (points.length == 0) return 0;
        
        int max = 1;
        for (Point p : points) {
            int num = maxPointsHelper(points, p);
            if (num > max) max = num;
        }
        return max;
        
    }
    
    private int maxPointsHelper(Point[] points, Point point) {
        Map<Float, Integer> map = new HashMap();
        int max = 0; //max points that have same k
        
        for (Point p : points) {
            float k = calculateK(point, p);
            //System.out.println("~~~~~~"+k);
            if (map.containsKey(k)) {
                int num = map.get(k) + 1;
                map.put(k, num); 
                //System.out.println("k = "+k+"  max = "+max);
                if (num > max && k != Float.POSITIVE_INFINITY) {
                    max = num;
                }
            } else {
                map.put(k, 1);
                if (max == 0 && k != Float.POSITIVE_INFINITY) max = 1;
            }
        }
        int self = map.get(Float.POSITIVE_INFINITY);
        max = max + 1 + (self > 1 ? (self - 1) : 0);
        //System.out.println("max = "+max+"  self = "+self);
        return Math.max(self, max);
        
    }
    
    private float calculateK(Point p1, Point p2) {
        if (p1.x == p2.x && p1.y == p2.y) return Float.POSITIVE_INFINITY;
        if (p1.x == p2.x) return Float.NaN;
        return ((float) (p1.y - p2.y)) / (p1.x - p2.x);
    }
}