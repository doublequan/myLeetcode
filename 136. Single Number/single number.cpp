class Solution
{
public:
	int singleNumber(int[] nums, int n)
	{
		if (n == 0)
			return 0;
		int res = 0;
		for (int i = 0; i < n; i++)
		{
			res ^= nums[i];  // xor by bits 
		}
		return res;
	}
};