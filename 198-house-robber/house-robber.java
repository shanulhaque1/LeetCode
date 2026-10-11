class Solution {
    public int rob(int[] nums) {
        int first = 0;
        int second = 0;
        for(int num:nums){
            int temp = second;
            second = Math.max(second, first+num);
            first = temp;
        }

        return second;
    }
}