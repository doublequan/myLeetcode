using namespace std;
#include <vector>
#include<algorithm>

class Solution 
{
public:
	int removeElement(vector<int>& nums, int val) 
	{
		for (vector<int>::iterator itr = nums.begin(); itr != nums.end(); )
		{
			if (*itr == val)
			{
				itr = nums.erase(itr);//erase() will update the itr, no need for itr++ 
			}
			else
				itr++;
		}

		return nums.size();
		//remove(nums, nums+nums.size());
	}
};
