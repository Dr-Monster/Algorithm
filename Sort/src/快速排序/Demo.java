package 快速排序;

public class Demo {

    public static void main(String[] args){
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        Demo demo = new Demo();
        System.out.print("排序前：");
        demo.printArr(numbers);
        demo.quickSort(numbers , 0 , numbers.length - 1);
        System.out.print("快速排序后：");
        demo.printArr(numbers);
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

    public void printArr(int[] numbers)
    {
        for(int i = 0 ; i < numbers.length ; i ++ )
        {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");
    }
}
