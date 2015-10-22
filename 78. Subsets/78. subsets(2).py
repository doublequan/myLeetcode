"""
Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
"""
# bit manipulation solution
class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        rst = []
        for i in xrange(2 ** len(nums)):
            rst += [[]]
            for bit in xrange(len(nums)):
                if (i >> bit & 1) == 1:
                    rst[i] += [nums[bit]]
        return rst




print Solution.subsets(Solution(), [1, 2, 3])