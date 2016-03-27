public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder res = new StringBuilder();
        if ((numerator > 0) ^ (denominator > 0)) res.append("-");
        long absN = Math.abs((long) numerator);
        long absDN = Math.abs((long) denominator);
        res.append(absN / absDN);
        long remainder = absN % absDN;
        if (remainder == 0) return res.toString();
        
        res.append(".");
        Map<Long, Integer> map = new HashMap();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                res.insert(map.get(remainder), "(");
                res.append(")");
                break;
            } else {
                map.put(remainder, res.length());
            }
            
            remainder *= 10;
            res.append(remainder / absDN);
            remainder = remainder % absDN;
        }
        
        return res.toString();
    }
}