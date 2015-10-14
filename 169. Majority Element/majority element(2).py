# coding=utf-8
"""
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

"""
# solution use bit manipulation
class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = [0] * 32
        for n in nums:
            for i in range(0, 32):
                if ((n >> i) & 1) == 1:
                    count[i] += 1
        rst = 0;
        for i in range(0, 32):
            if count[i] > len(nums) / 2:
                if i == 31:
                    rst -= 2 ** 31
                else:
                    rst += 2 ** i

        return rst


print Solution.majorityElement(Solution(), [-2147483648])