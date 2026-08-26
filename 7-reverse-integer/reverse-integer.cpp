class Solution {
public:
    int   reverse(int x) {
        long long  reverseno = 0;

        while(x!=0){

            long long   lastdigit = x %10;
            
            x = x/10;
            reverseno  = (reverseno * 10) + lastdigit;

        }

        if (reverseno > INT_MAX || reverseno < INT_MIN)
        return 0;

        else
        return reverseno;

    }

    
};