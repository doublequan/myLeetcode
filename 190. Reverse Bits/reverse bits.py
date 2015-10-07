"""
    Reverse bits of a given 32 bits unsigned integer.

    For example,
    given input 43261596 (represented in binary as 00000010100101000001111010011100),
    return 964176192     (represented in binary as 00111001011110000010100101000000).
"""
class Solution(object):
    def reverseBits(self, n):
        """
        :type n: int
        :rtype: int
        """
        for i in range(0, 16):
            if n >> i & 1 == 1 and n >> (31 - i) & 1 == 0:
                # set i th bit to zero
                n &= ~(1 << i)
                # set (31-i) th bit to one
                n |= (1 << (31 - i))
            elif n >> i & 1 == 0 and n >> (31 - i) & 1 == 1:
                n |= (1 << i)
                n &= ~(1 << (31 - i)) 
        return n



print Solution.reverseBits(Solution(), 43261596)
print 1 << 31, -1 << 1