class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int first = Integer.MIN_VALUE;
        int sec= Integer.MIN_VALUE;
        int third= Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>first){
                sec=first;
                first=nums[i];
            }
            else if(nums[i]>sec){
                sec=nums[i];
            }
            if(nums[i]<third){
                third=nums[i];
            }
        }
        return (first+sec)-(third);
    }
}