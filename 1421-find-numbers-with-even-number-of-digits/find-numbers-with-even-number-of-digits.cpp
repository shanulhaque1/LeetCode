class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int count = 0;
/*CONVERTING TO STRING--
        for(int i=0; i<nums.size(); i++){
            string s = to_string(nums[i]);
            if( s.length() %2==0){
                count += 1;
            }
        
        }
*/
        for(int num : nums){
            int digits = 0;
            while(num>0)
            {   digits++;
                num /= 10;
            }
            if(digits%2==0)
            count++;
        }      
        return count;
    }
};