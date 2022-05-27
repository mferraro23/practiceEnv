package practiceEnv.MedianSortedArrays;

import java.util.Arrays;

public class MedianClass {
    public MedianClass(){
        int[] num1 = {1,2,6,4,5};
        int[] num2 = {9,7,8,3,10};
        MedianClassRun(num1, num2);
    }
    public double MedianClassRun(int[] nums1, int[] nums2) {
        double median = 0.0;
        int val1 = 0;
        int val2 = 0;
        int length = nums1.length + nums2.length;
        int[] mergedArrays = new int[length];
        int i;
        for(i=0;i<nums1.length;i++) {
            mergedArrays[i] = nums1[i];
        }
        int j = i;
        for (int k : nums2) {
            mergedArrays[j] = k;
            j += 1;
        }
        Arrays.sort(mergedArrays);
        for(int nums: mergedArrays){
            System.out.print(nums);
        }

        if(length % 2 == 0){
            val1 = (length / 2) - 1;
            val2 = length / 2;
            median = (mergedArrays[val1] + mergedArrays[val2])/2.0;
        }
        else{
            val1 = length/2;
            median = mergedArrays[val1];
        }
        System.out.println("\n" + val1 + "," + val2 + "," + median);
        return median;
    }
}
