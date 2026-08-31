class Solution {
    public int smallestEqual(int[] nums) {
        int result =-1;
        for(int i = 0; i<nums.length; i++){
            if(i%10==nums[i]){
                result =i;
                break;}

        }
        return result ;
        
    }
}