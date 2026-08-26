class Solution {
public:
    bool isPalindrome(int x) {
        long long  org = x;

        if(x<0 || x > INT_MAX || x > INT_MAX){
           return false;
        }
        
        long long rev = 0;
        while( x != 0){
            rev = ( rev *10) + (x %10);
            x = x/10;
        }
        

        if (rev == org ){
            return true ;
        }

        else
            return false;
        
        
    }
};