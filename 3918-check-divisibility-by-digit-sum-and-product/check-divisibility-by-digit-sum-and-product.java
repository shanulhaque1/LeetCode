class Solution {
    public boolean checkDivisibility(int n) {
        int org = n;
        int sum =0;
        int pro = 1;
        while(n >0){
            int ld = n%10;
            sum+=ld;
            pro*=ld;
            n/=10;
        }
        int finalsum=sum + pro;

        if(org % finalsum==0) return true;

        else return false;
    }
}