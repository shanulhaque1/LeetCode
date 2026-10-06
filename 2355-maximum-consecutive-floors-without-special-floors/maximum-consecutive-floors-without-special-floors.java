class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int n = special.length;
        Arrays.sort(special);
        int maxi = 0;
        maxi = Math.max(maxi,special[0]-bottom);
        maxi = Math.max(maxi,top-special[n-1]);
        for(int i=1;i<n;i++)
            {
                maxi = Math.max(maxi,special[i]-special[i-1]-1);
            }
        return maxi;
    }
}