class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merge [] = new int [nums1.length + nums2.length];
        int i=0;
        while(i<nums1.length){
            merge[i]=nums1[i];
            i++;
        }

        int j=i;
        int ind=0;
        while(j<nums1.length + nums2.length){
            merge[j]=nums2[ind];
            ind++;
            j++;
        }

        Arrays.sort(merge);
        double median;
        if(merge.length%2!=0){
            median =merge[( merge.length-1)/2];
        }

        else{
        median = (merge[(merge.length)/2 -1] + merge[( merge.length)/2]) / 2.0;}
        
        return median;
    }

}