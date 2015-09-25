__author__ = 'Bill Quan'
import math

class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 1 or n == 2:
            return n

        pre1 = 2
        pre2 = 1

        for i in range(3, n+1):
            tmp = pre1
            pre1 = pre1 + pre2
            pre2 = tmp
 
        return pre1


print Solution.climbStairs(Solution(), 4)


