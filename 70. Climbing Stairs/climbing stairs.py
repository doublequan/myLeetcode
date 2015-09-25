__author__ = 'Bill Quan'
import math

class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        for j in range(0, n/2 + 1):
            i = n - 2 * j
            count += math.factorial(i+j) / (math.factorial(i) * math.factorial(j))
        return count

print Solution.climbStairs(Solution(), 4)


