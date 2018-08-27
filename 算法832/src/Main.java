import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.util.Arrays;

public class Main {

    //https://leetcode-cn.com/problems/flipping-an-image/description/
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test(){
        int[][] a = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] re = trans(a);
        for (int i = 0 ; i < re.length ; i++){
            for (int j = 0; j < re[0].length ; j++){
                System.out.print(re[i][j]);
                if (j == a[0].length -1 ){
                    System.out.println("");
                }
            }
        }
    }


    public int[][] trans(int[][] a){
        int[][] newInt = new int[a.length][];
        newInt = a ;
        //行长度
        for (int j = 0 ; j < newInt.length ; j++){
            exchange(newInt[j]);
        }
        for (int i = 0 ; i < newInt.length ; i++){
            for (int j = 0 ; j < newInt[0].length ; j++){
                if(newInt[i][j] == 0){
                    newInt[i][j] = 1;
                }else{
                    newInt[i][j] = 0 ;
                }
            }
        }
        return newInt;
    }


    public void exchange(int a[]){
        for (int i = 0 ; i < a.length/2 ; i++){
            int temp ;
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp ;
        }
    }
}
