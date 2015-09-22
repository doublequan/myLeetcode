__author__ = 'Bill Quan'


class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        n = len(nums)
        i = 0
        while i < n:
            if nums[i] == val:
                nums[i] = nums[n-1]
                n -= 1
                #print "nums = " , nums, "| n = ", n
                continue
            else:
                i += 1
        nums = nums[:n]
        #print nums
        return n

nums = [1,2,3,9,9,9,9,9,9,4]

print Solution.removeElement(Solution(), nums, 9)
print nums

