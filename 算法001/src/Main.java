//给定一个数,从数组中取出对应的位置
//给定 nums = [2, 7, 11, 15], target = 9
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(((nums[i] + nums[j]) == target) && i != j ){
                    if(i > j){
                        result[0] = j ;
                        result[1] = i ;
                    }else{
                        result[0] = i;
                        result[1] = j;
                    }
                }else{
                    continue;
                }
            }
        }
        return result;
    }
}

