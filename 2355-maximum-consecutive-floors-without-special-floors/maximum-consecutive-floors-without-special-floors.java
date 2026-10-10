class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int n = special.length;
        Arrays.sort(special);
        int a = special[0]-bottom;
        int b = Math.abs(special[n-1]-top);

        int d=0;
        for(int i=1;i<n;i++){
            int c = special[i]-special[i-1] - 1;
            if(c>d) d=c;
        }

        return Math.max(d,Math.max(a,b));
    }
}