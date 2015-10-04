"""
Given an array of integers, every element appears three times except for one. Find that single one.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using
extra memory?
"""


class Solution(object):
    def singleNumber(self, nums):
        """

        :param nums:List[int]
        :return:int
        """
        one, two, three = 0, 0, 0
        for n in nums:
            two |= one & n
            one ^= n
            three = one & two
            one &= ~three
            two &= ~three
        return one 

print Solution.singleNumber(Solution(), [1])