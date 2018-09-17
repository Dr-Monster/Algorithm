
//https://leetcode-cn.com/problems/reverse-integer/description/description

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test(){
        int s = reverse(-1234567890);
        System.out.println(s);
    }

    public int reverse(int x) {
        List<String> list = new ArrayList<>();
        if (x >= 0 && x<= Integer.MAX_VALUE){
            char[] trans = String.valueOf(x).toCharArray();
            for (char charItem : trans){
                list.add(String.valueOf(charItem));
            }
            Collections.reverse(list);
            StringBuffer sb = new StringBuffer();
            for (String stringItem : list){
                sb.append(stringItem);
            }
            if ((x >= 0 && x<= Integer.MAX_VALUE) || x <= 0 && x>= Integer.MIN_VALUE){
                return Integer.valueOf(sb.toString());
            }else{
                return 0 ;
            }
        }else if (x <= 0 && x>= Integer.MIN_VALUE){
            char[] trans = String.valueOf(x).split("-")[1].toCharArray();
            for (char charItem : trans){
                list.add(String.valueOf(charItem));
            }
            Collections.reverse(list);
            StringBuffer sb = new StringBuffer();
            sb.append("-");
            for (String stringItem : list){
                sb.append(stringItem);
            }
            if ((x >= 0 && x<= Integer.MAX_VALUE) || x <= 0 && x>= Integer.MIN_VALUE){
                return Integer.valueOf(sb.toString());
            }else{
                return 0 ;
            }
        }else{
            return 0 ;
        }
    }
}
