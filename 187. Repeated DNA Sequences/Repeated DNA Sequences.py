"""
All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
"""
# brust solution using HashSet

class Solution(object):
    def findRepeatedDnaSequences(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        store = set([])
        rst = set([])
        for i in xrange(len(s)):
            if i < 9:
                continue
            str = s[i-9:i+1]
            if str in store:
                rst.add(str)
            else:
                store.add(str)
        return [i for i in rst]

print Solution.findRepeatedDnaSequences(Solution(), "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")

