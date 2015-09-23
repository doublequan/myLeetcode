using namespace std;
#include <vector>

class Solution 
{
public:
	int removeElement(vector<int>& nums, int val) 
	{
		int target = 0;
		for (int i = 0; i < nums.size(); i++)
		{
			if (nums[i] != val)
			{
				nums[target] = nums[i];
				target++;
			}
		}
		return target;
	}
};
