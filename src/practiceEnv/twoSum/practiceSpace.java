package practiceEnv.twoSum;

import java.util.Arrays;

public class practiceSpace {

    public practiceSpace() {
        int[] newArray = {3,2,4};
        int target = 6;
        int[] solution = twoSum(newArray, target);
        System.out.println(Arrays.toString(solution));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] newArray = new int[2];
        int j = 0;
        boolean reached = false;
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
