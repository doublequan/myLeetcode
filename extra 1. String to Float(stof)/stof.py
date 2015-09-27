__author__ = 'Bill Quan'


class Solution:
    def myStof(self, str):
        """

        :param str: str
        :return: float
        """
        str = str.strip()
        sign = +1
        if str[0] == '-':
            sign = -1
        if str[0] == '+':
            sign = +1
        i = 1
        rst = 0
        while i < len(str) and str[i].isdigit():
            rst = rst * 10 + int(str[i])  # ord(str[i]) - ord('0') is ok as well
            i += 1

        dec = 0
        if i < len(str) and str[i] == '.':
            i += 1
            div = 0.1
            while i < len(str) and str[i].isdigit():
                dec += int(str[i]) * div
                div *= 0.1
                i += 1

        return sign * (rst + dec)

# TEST:
test = Solution()
print test.myStof("1"), " || 1"
print test.myStof("-67"), " || -67"
print test.myStof("-67.890"), " || -67.89"
print test.myStof("  -0.00001234567890"), " || -0.0000123456789"
print test.myStof("  -0000.+00890"), " || 0"
print test.myStof("       -67.89"), " || -67.89"
print test.myStof("       ++67.89"), " || 0"
print test.myStof("       +n67.89"), " || 0"
print test.myStof("  +67.89sad"), " || 67.89"



"""
# overflow TEST
# the exponent of float in python is -1024 ~ +1023
t = 2.0 ** 1023
print t, type(t)
"""