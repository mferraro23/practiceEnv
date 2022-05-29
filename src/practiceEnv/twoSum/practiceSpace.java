package practiceEnv.twoSum;

import java.util.Arrays;

public class practiceSpace {

    public practiceSpace() {
        // Declare the array.
        int[] newArray = {3,2,7};
        // target shows what sum we want to end up with.
        int target = 10;
        // will return the indicies that sum to target.
        System.out.println(Arrays.toString(twoSum(newArray, target)));
    }
    public int[] twoSum(int[] nums, int target) {
        // new array to add the proper indices to
        int[] newArray = new int[2];
        int j = 0;
        boolean reached = false;

        // while it hasn't been reached we can check all indices.
        while(!reached){
            for(int i = 0; i<nums.length-1;i++){
                if(nums[i]+nums[j] == target){
                    if(i!=j) {
                        newArray[0] = j;
                        newArray[1] = i;
                        reached = true;
                    }
                }
            }
            j += 1;
        }
        return newArray;
    }
}
