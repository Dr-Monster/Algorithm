package com.company;

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new Main().maxArea(height));
    }

    /**
     * 未优化方案,双重for循环,时间复杂度n²
     * @param heights
     * @return
     */

    public int maxArea(int[] heights) {
        int sum = 0;
        for(int i = 0 ; i < heights.length ; i++){
            for(int j = 0 ; j < heights.length ; j++){
                int height = heights[i] > heights[j] ? heights[j] : heights[i];
                int width = Math.abs(i - j);
                int tempSum = height * width;
                if(sum < tempSum){
                    sum = tempSum;
                }
            }
        }
        return sum;
    }
}
