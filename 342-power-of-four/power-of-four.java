class Solution {
    public boolean isPowerOfFour(int n) {
        int [] expo = new int[17];
        expo[0]= 1;
        for(int i=1; i<17; i++){
            expo[i] = expo[i-1]*4;

            if(n==expo[i-1])
            return true;

        }
        
        return false;
    }
}