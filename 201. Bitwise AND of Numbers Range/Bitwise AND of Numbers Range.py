"""
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

For example, given the range [5, 7], you should return 4.
"""

class Solution(object):
    def rangeBitwiseAnd(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """

        xor = m ^ n
        bit = 0
        while xor != 0:
            xor >>= 1
            bit += 1
        return (m >> bit) << bit

print Solution.rangeBitwiseAnd(Solution(), 1, 1)

