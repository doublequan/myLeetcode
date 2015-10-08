using namespace std;
#include <iostream>

class Solution {
public:
	uint32_t reverseBits(uint32_t n) {
		 
		for (int i = 0; i <= 15; i++)
		{
			if ((n >> i & 1) == 1 && ((n << i & 0x80000000) == 0))
			{
				n &= ~(1 << i);
				n |= 0x80000000 >> i;
				
			}
			else if ((n >> i & 1) == 0 && ((n << i & 0x80000000) == 0x80000000))
			{
				n |= 1 << i;
				n &= ~(1 << (31 - i));
			}
		}
		return n;


	}
};

int main() 
{
	Solution sol;
//	float a = FLT_MIN;
//	cout << sol.reverseBits(1);
	cout << (3 << 30);



	system("pause");
	return 0;
}