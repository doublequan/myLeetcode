/*
Given an array of integers, every element appears three times except for one. Find that single one.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using
extra memory?
*/

class Solution
{
public:
	int singleNumber(vector<int>& nums)
	{
		int count[32];
		int res = 0;
		fill_n(&count[0], 32, 0);
		for (int i = 0; i < nums.size(); i++)
		{
			for (int j = 0; j < 32; j++)
			{
				count[j] += (nums[i] >> j) & 1;
			}
		}

		for (int i = 0; i < 32; i++)
		{
			count[i] %= 3; 
			res += (count[i] << i);   //convert binary to decimal    
		}
		return res;
	}
};