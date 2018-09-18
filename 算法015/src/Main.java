import org.junit.Test;

import java.util.*;

//https://leetcode-cn.com/problems/3sum/description/

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test() {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        int[] arr1 = new int[]{};
        System.out.println(threeSum(arr1));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();

        if(nums.length == 0 || nums == null){
            return listList;
        }

        sort(nums, 0, nums.length - 1);
        //多层for循环在性能上会有问题
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    List<Integer> integerList = new ArrayList<>();
                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];
                    if (a + b + c == 0) {
                        integerList.add(a);
                        integerList.add(b);
                        integerList.add(c);
                    }
                    if(integerList != null && integerList.size() != 0){
                        listList.add(integerList);
                    }
                }
            }
        }
        Set<List<Integer>> listSet = new HashSet<>();
        listSet.addAll(listList);
        listList.clear();
        listList.addAll(listSet);
        return listList;
    }

    public void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        while (end > start) {
            //从后往前比较
            while (end > start && a[end] >= key) {
                //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            }
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while (end > start && a[start] <= key) {
                //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            }
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        //递归
        if (start > low) {
            //左边序列。第一个索引位置到关键值索引-1
            sort(a, low, start - 1);
        }
        if (end < high) {
            //右边序列。从关键值索引+1到最后一个
            sort(a, end + 1, high);
        }
    }
}
