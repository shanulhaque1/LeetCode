class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] pos = new int [nums.length/2];
        int p=0;
        int [] neg = new int [nums.length/2];
        int n=0;
        for(int num : nums){
            if (num>0){
                pos[p]=num;
                p++;
            }
            else
            {
                neg[n]=num;
                n++;
            }
        }
        int [] result= new int [nums.length];
        int ind=0;
        int indd=0;
        for(int i=0; i<nums.length; i++){
            
            if(i%2==0){
                
                result[i]=pos[ind];
                ind++;
            }
            else
            { 
            result[i]=neg[indd];
            indd++;
            }
        }
        return result;
    }
}