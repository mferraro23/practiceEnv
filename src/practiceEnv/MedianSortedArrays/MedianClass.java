package practiceEnv.MedianSortedArrays;

import java.util.Arrays;

public class MedianClass {
    public MedianClass(){
        // Declare two arrays that will be merged.
        int[] num1 = {1,2,6,4,5};
        int[] num2 = {9,7,8,3,10};

        // Prints the median
        System.out.println(MedianClassRun(num1, num2));
    }
    public double MedianClassRun(int[] nums1, int[] nums2) {
        double median;
        int val1, val2;

        // Set length equal to the two array lengths summed, so we can add all values to new array.
        int length = nums1.length + nums2.length;
        int[] mergedArrays = new int[length];

        // Merge arrays.
        int i;
        for(i=0;i<nums1.length;i++) {
            mergedArrays[i] = nums1[i];
        }
        int j = i;
        for (int k : nums2) {
            mergedArrays[j] = k;
            j += 1;
        }
        // Sort the arrays
        Arrays.sort(mergedArrays);

        // Determine median
        // If the length is equal, average the 2 middle terms for the median
        // Else return the median which is the index of length/2/
        if(length % 2 == 0){
            val1 = (length / 2) - 1;
            val2 = length / 2;
            median = (mergedArrays[val1] + mergedArrays[val2])/2.0;
        }
        else{
            val1 = length/2;
            median = mergedArrays[val1];
        }
        return median;
    }
}
