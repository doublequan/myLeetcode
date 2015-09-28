using namespace std;
#include <string>
#include <iostream>

class Solution
{
public:
	float myStof(string str)
	{
		int i = 0;
		int sign = 1;
		float rst = 0;
		while (i < str.length() && str[i] == ' ')
		{
			i++;
		}

		if (str[i] == '-')
		{
			sign = -1;
			i++;
		}
		else if (str[i] == '+')
		{
			i++;
		}

		while (i < str.length() && str[i] <= '9' && str[i] >= '0')
		{
			if (rst >= FLT_MAX / 10)
				return sign * FLT_MAX;
			rst = rst * 10 + str[i] - '0';
			i++;
		}

		float dec = 0;
		float exp = 0.1;
		if (i < str.length() && str[i] == '.')
		{
			i++;
			while (i < str.length() && str[i] <= '9' && str[i] >= '0')
			{
				dec += (str[i] - '0') * exp;
				exp *= 0.1;
				i++;
			}
		}
		return sign * (rst + dec);
	}
};

int main()
{
	Solution sol;
	float a = FLT_MIN;
	cout << sol.myStof("   -0.1234567890");

	
	system("pause");
	return 0;
}