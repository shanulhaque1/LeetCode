class Solution {
    public boolean isPowerOfFour(int n) {
        int [] expo = new int[16];
        expo[0]= 1;
        if(n==expo[0])
        return true; 
        
        for(int i=1; i<16; i++){
            expo[i] = expo[i-1]*4;

            if(n==expo[i])
            return true;

        }
        
        return false;
    }
}