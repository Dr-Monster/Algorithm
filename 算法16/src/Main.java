import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/3sum-closest/
 */


public class Main {

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1 ;
        int result = new Main().threeSumClosest(nums , 1);
    }

    public int threeSumClosest(int[] nums, int target) {
        int x = 0 , y = 0 , z= 0;
        List numList = Arrays.asList(nums);

        if(numList.contains(target)){
            x = target;
        }




        return x + y + z;
    }

}
