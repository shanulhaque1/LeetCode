class Solution {
    public boolean isPowerOfThree(int n) {
        int [] expo = new int [21];
        expo[0] = 1;
        if(n==expo[0])
        return true;

        for(int i=1; i<21; i++){
            expo[i] = expo[i-1]*3;
            if(n==expo[i])
            return true;
        }

        return false;
    }
}