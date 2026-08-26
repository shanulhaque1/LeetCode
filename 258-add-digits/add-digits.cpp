class Solution {
public:
    int addDigits(int num) {
        int sum = 0;
        while(num>0){
            
            int ld = num%10;
            num = num/10;

            sum= sum + ld;      
        }
        int fsum = sum;

        if(sum>=10){
            num = sum;
            return addDigits(num);
            
        }


        return fsum;
    }   
        
    
    
};