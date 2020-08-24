package com.company;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */

public class Main {

    public static void main(String[] args) {
        String[] tempStr = new String[]{"flower","flow","flight"};
        System.out.println(new Main().longestCommonPrefix(tempStr));
    }


    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0){
            return prefix;
        }

        String reg = "^[a-z]+$";

        Set<String> prefixSet = new HashSet<>();
        String commonStr = strs[0];
        int length = commonStr.length();
        for(int i = 0 ; i < strs.length ; i++){
            String item = strs[i];
            if (!item.matches(reg)) {
                return prefix;
            }
            if(item.length() < length){
                length = item.length();
                commonStr = item;
            }
        }

        String commonPrefix = "";

        for (int i = 0 ; i < length ; i++){
            String checkString = getSubString(commonStr , 0 , i);
            boolean checkFlag = true;
            for(int j = 0 ; j < strs.length ; j++){
                String compareStr = getSubString(strs[j] , 0 , i);
                if(!checkString.equals(compareStr)){
                    checkFlag = false;
                    break;
                }
            }
            if(checkFlag){
                if(checkString.length() > commonPrefix.length()){
                    commonPrefix = checkString;
                }

            }
        }

        prefix = commonPrefix;
        return prefix;
    }




    public String getSubString(String targrt , int begin , int end){
        char[] chars = targrt.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        if (end == targrt.length()){
            return targrt;
        }
        for(int i = 0 ; i <= end ; i++){
            stringBuffer.append(chars[i]);
        }
        return stringBuffer.toString();
    }
}
