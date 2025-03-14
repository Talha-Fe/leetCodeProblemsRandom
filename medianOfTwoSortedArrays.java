class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int leng = nums1.length+nums2.length;
        double[] mergedArray = new double[leng];
        int remain = mergedArray.length%2;
        int arrOne = nums1.length;       
        int merLeng = mergedArray.length/2;

        for(int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }

        for(int i = 0; i < nums2.length; i++) {
            mergedArray[i+arrOne] = nums2[i];
        }

        if(remain == 1){
            Arrays.sort(mergedArray);
            return mergedArray[merLeng];
        }
        else {
            Arrays.sort(mergedArray);
            double evenArr = (mergedArray[merLeng]+mergedArray[merLeng-1])/2.0;
            return evenArr;
        }

    }

}
