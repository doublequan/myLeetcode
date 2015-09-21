using namespace std;
#include <limits>
#include <string>
#include <iostream>

class Solution 
{
public:
	int myAtoi(string str) 
	{
		int sign = 1;
		int rst = 0;
		int i = 0;
		while (i < str.length() && str[i] == ' ') i++;
		if (i >= str.length()) return 0;
		if (str[i] == '-')
		{
			sign = -1;
			i++;
		}
		else if (str[i] == '+')
		{
			i++;
		}
		
		while (i < str.length())
		{
			if (str[i] > '9' || str[i] < '0')
				break;
			// deal with overflow
			if (rst > INT_MAX / 10 || (rst == INT_MAX / 10 && (str[i] - '0') > INT_MAX % 10))
				//|| (sign == 1 && rst * 10 > (INT_MAX - str[i] + '0'))
				//|| (sign == -1 && rst * 10 > (INT_MAX + 1 - str[i] + '0')))
			{
				return sign == 1 ? INT_MAX : INT_MIN;
			}
			rst = rst * 10 + str[i] - '0';
			i++;
		}

		return sign * rst;
	}
};

void main()
{
	Solution sol;
	cout << sol.myAtoi("-2147483648");


	system("pause");
	return;
}
