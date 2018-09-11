import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test() {
        int[] nums1 = new int[]{3};
        int[] nums2 = new int[]{-2 , -1};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0;
        int[] allSum = new int[nums1.length + nums2.length];
        for (int i = 0 ; i < nums1.length ; i++){
            allSum[i] = nums1[i];
        }

        for (int j = 0 ; j < nums2.length ; j++){
            allSum[j + nums1.length] = nums2[j];
        }
        quickSort(allSum , 0 , allSum.length - 1);
        if (allSum[0] >= 0){
            sum = (Double.valueOf(allSum[0]) + Double.valueOf(allSum[allSum.length - 1])) / 2 ;
        }else{
            sum = (Double.valueOf(allSum[allSum.length - 1]) - Double.valueOf(allSum[0])) / 2 ;
        }

        return sum ;
    }

    public void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            //将numbers数组进行一分为二
            int middle = getMiddle(numbers, low, high);
            //对低字段表进行递归排序
            quickSort(numbers, low, middle - 1);
            //对高字段表进行递归排序
            quickSort(numbers, middle + 1, high);
        }
    }

    public int getMiddle(int[] numbers, int low, int high) {
        //数组的第一个作为中轴
        int temp = numbers[low];
        while (low < high) {
            while (low < high && numbers[high] > temp) {
                high--;
            }
            //比中轴小的记录移到低端
            numbers[low] = numbers[high];
            while (low < high && numbers[low] < temp) {
                low++;
            }
            //比中轴大的记录移到高端
            numbers[high] = numbers[low];
        }
        //中轴记录到尾
        numbers[low] = temp;
        // 返回中轴的位置
        return low;
    }
}
