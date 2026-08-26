class Solution {
public:
    int countDigits(int num) {
        int count = 0;
        int orgnum = num;
        while(num>0){
            int ld = num%10;
            if(orgnum%ld==0){
                count++;
            }
            num = num/10;

        }
        return count;
    }
};