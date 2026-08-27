class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int  sum = 0;
        int digits = 0;
        
        for(int i=0; i<nums.size(); i++){
            sum = sum+nums[i];

            while(nums[i]>0){
            int ld=nums[i]%10;
            nums[i] = nums[i]/10;
            digits += ld;
            }
            
        }
        int result = sum - digits;
        return result;

    }
};