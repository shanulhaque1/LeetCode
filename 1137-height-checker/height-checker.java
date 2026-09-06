class Solution {
    public static int heightChecker(int[] heights) {
        int [] exp = new int[heights.length];
        
        
        int count = 0;

        for(int i=0; i<heights.length; i++){
            exp[i] = heights[i];
        }
        Arrays.sort(exp);

        for(int j=0; j<heights.length; j++){
        if(heights[j]!=exp[j])
            count++;
    }
    return count;
        
    }
}