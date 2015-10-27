"""
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
"""
# Binary Search Solution

class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        start = 0
        end = len(nums)
        mid = (start + end)/2
        while start < end:
            mid = (start + end)/2
            if nums[mid] > mid:
                end = mid
            else:
                start = mid + 1
        return start



print Solution.missingNumber(Solution(), [0, 1, 3])