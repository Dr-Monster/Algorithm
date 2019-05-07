import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 */

/**
 * quick-sort:
 * https://www.cnblogs.com/skywang12345/p/3596746.html
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        test1();
    }

    public static void test1() {
        int[] a = {1,1};
        int[] b = {1,3};
        double result = new Main().getMidCount(a, b);
        System.out.println(result);
    }

    public double getMidCount(int[] nums1, int[] nums2) {


        List<Integer> list = new ArrayList<>(nums1.length + nums2.length);

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        
        int[] mix = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            mix[i] = list.get(i);
        }

        quickSort(mix, 0, list.size() - 1);

        double result = 0;

        if(mix.length % 2 == 1){
            result = mix[mix.length / 2];
        }else{
            result = (double)Math.round((mix[mix.length / 2 - 1] + mix[mix.length/2])*10 / 2)/10;
        }
        return result;
    }

    public void quickSort(int a[], int l, int r) {
        if (l < r) {
            int i, j, x;
            i = l;
            j = r;
            x = a[i];
            while (i < j) {
                while (i < j && a[j] > x) {
                    // 从右向左找第一个小于x的数
                    j--;
                }
                if (i < j){
                    a[i++] = a[j];
                }
                while (i < j && a[i] < x){
                    // 从左向右找第一个大于x的数
                    i++;
                }
                if (i < j){
                    a[j--] = a[i];
                }
            }
            a[i] = x;
            quickSort(a, l, i - 1);
            quickSort(a, i + 1, r);
        }
    }
}
