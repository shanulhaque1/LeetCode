class Solution {
    public static int heightChecker(int[] heights) {
        int [] exp = heights.clone();
        Arrays.sort(exp);
        
        int count = 0;
        

        for(int j=0; j<heights.length; j++){
        if(heights[j]!=exp[j])
            count++;
    }
    return count;
        
    }
}