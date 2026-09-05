class Solution {
    public boolean isPowerOfFour(int n) {
        int expo;
        expo = 1;
        if(n==expo)
        return true; 
        
        for(int i=1; i<16; i++){
            expo *= 4;

            if(n==expo)
            return true;

        }
        
        return false;
    }
}