package com.company;

/**
 * https://leetcode-cn.com/problems/palindrome-number/
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /**
     * 数字转字符串解法
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String originalNumber = String.valueOf(x);
        StringBuffer stringBuffer = new StringBuffer(originalNumber).reverse();
        String checkNumber = stringBuffer.toString();
        return originalNumber.compareToIgnoreCase(checkNumber) == 0;
    }



    public boolean isPalindrome(int x , String numberType) {
        return true;
    }

}
