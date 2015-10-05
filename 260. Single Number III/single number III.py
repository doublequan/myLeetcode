"""
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly
twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
"""


class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        xor_res = reduce(lambda x, y: x ^ y, nums)

        i = 0
        while xor_res & 1 == 0:
            xor_res >>= 1
            i += 1

        res1, res2 = 0, 0
        for n in nums:
            if (n >> i) & 1 == 1:
                res1 ^= n
            else:
                res2 ^= n
        return [res1, res2]



print Solution.singleNumber(Solution(), [2, 2, 4, 4, 99, 1])
