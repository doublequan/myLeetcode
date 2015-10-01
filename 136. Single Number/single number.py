__author__ = 'Bill Quan'
"""
    Given an array of integers, every element appears twice except for one. Find that single one.
"""

class Solution(object):
    def singleNumber(self, nums):
        """

        :param nums: list[int]
        :return: int
        """
        if len(nums) == 0:
            return 0
        res = nums[0]
        i = 1 
        while i < len(nums):
            res ^= nums[i]
            i += 1
        return res


