package practiceEnv.WeeklyChallenge_6_4_2022.MinMaxGame;

import java.util.Arrays;

public class MinMaxClass {
    public MinMaxClass(){
        int[] nums = {1,3,5,2,4,8,2,2};

        System.out.println(findMinMax(nums));
    }
    public int findMinMax(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n/2];

        while(n>1){
            newNums = new int[n];
            for(int i = 0; i<n; i++){
                if(i%2==0){
                    if(i < n / 2){
                        newNums[i] = Math.min(nums[2*i], nums[2 * i +1]);
                    }
                }
                else {
                    if(i < n / 2){
                        newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                    }
                }
            }
            int[] temp = nums;
            nums = newNums;
            newNums = temp;
            n = n/2;
        }

        System.out.println(Arrays.toString(nums));

        nums = newNums;
        return nums[0];
    }
}
