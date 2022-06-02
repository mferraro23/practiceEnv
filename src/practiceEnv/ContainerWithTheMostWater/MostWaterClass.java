package practiceEnv.ContainerWithTheMostWater;

public class MostWaterClass {
    public MostWaterClass(){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxHeight(height));
    }
    public int maxHeight(int[] height){
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])
                    * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
