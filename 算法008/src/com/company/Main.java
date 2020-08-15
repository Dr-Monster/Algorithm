package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/string-to-integer-atoi/
 *
 *
 * ^[1-9]\d*$　 　 //匹配正整数
 * ^-[1-9]\d*$ 　 //匹配负整数
 * ^-?[1-9]\d*$　　 //匹配整数
 * ^[1-9]\d*|0$　 //匹配非负整数（正整数 + 0）
 * ^-[1-9]\d*|0$　　 //匹配非正整数（负整数 + 0）
 * ^[1-9]\d*\.\d*|0\.\d*[1-9]\d*$　　 //匹配正浮点数
 * ^-([1-9]\d*\.\d*|0\.\d*[1-9]\d*)$　 //匹配负浮点数
 * ^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$　 //匹配浮点数
 * ^[1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0$　　 //匹配非负浮点数（正浮点数 + 0）
 * ^(-([1-9]\d*\.\d*|0\.\d*[1-9]\d*))|0?\.0+|0$　　//匹配非正浮点数（负浮点数 + 0）
 *
 * 在使用的时候要去掉正则后面的 \d; 列: ^[1-9]*$
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(new Main().myAtoi("-91283472332"));
    }



    @Test
    public void test(){
        System.out.println(Integer.valueOf("-123"));
    }


    public int myAtoi(String str) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int result = 0;

        if("".equals(str) || str == null){
            return result;
        }

        String numberReg = "^[1-9]*$";

        char[] chars = str.trim().toCharArray();

        List<String> tempList = new ArrayList<>();

        int i = 0;
        for(char item : chars){
            String checkItemStr = String.valueOf(item);
            if(!checkItemStr.matches(numberReg) && i == 0 && !"-".equals(checkItemStr) && !"+".equals(checkItemStr)){
                break;
            }
            if("-".equals(checkItemStr)&& i == 0){
                tempList.add(checkItemStr);
                i++;
            }else{
                if((checkItemStr.matches(numberReg)) || ("0".equals(checkItemStr) && i != 0)){
                    tempList.add(checkItemStr);
                    i++;
                }
            }
        }

        String finalStr = String.join("" , tempList);

        try{
            //不想处理这种sb的数字大小越界的问题了,真TM的zz
            int number = Integer.valueOf(finalStr);
            if(number > max){
                result = max;
            }else if(number < min){
                result = min;
            }else{
                result = number;
            }
        }catch (NumberFormatException e){
            result = 0;
        }
        return result;
    }
}
