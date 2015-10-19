"""
All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
"""
# Optimized solution using HashSet and Bitwise Manipulation

class Solution(object):
    def findRepeatedDnaSequences(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        store = set([])
        rst = set([])
        sequence = 0
        for i in xrange(len(s)):
            sequence <<= 2
            if s[i] == "A":
                pass
            elif s[i] == "C":
                sequence |= 0b01
            elif s[i] == "G":
                sequence |= 0b10
            elif s[i] == "T":
                sequence |= 0b11
            else:
                raise ValueError("Input Error!")
            if i < 9:
                continue
            v = sequence & 0xfffff
            if v in store:
                rst.add(v)
            else:
                store.add(v)
        res = []
        for v in rst:
            tmp = ""
            for i in xrange(18, -1, -2):
                r = v >> i & 0b11
                if r == 0b00:
                    tmp += "A"
                elif r == 0b01:
                    tmp += "C"
                elif r == 0b10:
                    tmp += "G"
                elif r == 0b11:
                    tmp += "T"
            res.append(tmp)
        return res

print Solution.findRepeatedDnaSequences(Solution(), "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT")

