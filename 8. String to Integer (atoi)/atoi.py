__author__ = 'Bill Quan'
"""
Implement atoi to convert a string to an integer.
Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself
      what are the possible input cases.
Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather
       all the input requirements up front.
"""


class Solution(object):
    def myAtoi(self, str):
        """
        :param Str: str
        :return: int
        """
        i, sign, ret = 0, 1, 0
        if len(str) == 0:
            return 0
        while i < len(str) and str[i] == ' ':
            i += 1
        if str[i] == '+':
            i += 1
        elif str[i] == '-':
            sign = -1
            i += 1
        while i < len(str) and str[i] >= '0' and str[i] <= '9':
            ret = ret * 10 + ord(str[i]) - ord('0')
            i += 1
        return max(min(ret * sign, 2147483647), -2147483648)

sol = Solution()
print Solution.myAtoi(sol, '1')
