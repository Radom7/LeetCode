package com.haiyu;


/**
 * @Desc:  判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @Author: liuxing
 * @Date: 2020/5/14 21:56
 * @Version 1.0
 */
public class PalindromeTest {

    public static void main(String[] args) {
        System.out.println(isPalindrome(2));
    }

    private static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int k = 0;
        int temp = x;
        while (x > 0){
            k = k*10+x%10;
            x /= 10;
        }

        return k == temp;
    }

}
