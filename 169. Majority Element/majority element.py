# coding=utf-8
"""
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

"""
# solution use hashtable
class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dict = {}
        for n in nums:
            if dict.has_key(n):
                dict[n] += 1
            else:
                dict[n] = 1
            if dict[n] > (len(nums)/2):
                majority = n
                break
        return majority



print Solution.majorityElement(Solution(), [2, 2])