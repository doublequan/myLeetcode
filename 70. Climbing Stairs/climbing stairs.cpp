using namespace std;
//#include <math.h>
/*
* Warning : This solution is too slow, it cannot pass the OJ of Leetcode
*/


class Solution 
{
public:
	int climbStairs(int n) 
	{
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		return climbStairs(n - 1) + climbStairs(n - 2);
	}
};