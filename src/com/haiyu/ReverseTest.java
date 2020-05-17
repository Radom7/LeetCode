package com.haiyu;

/**
 * @Desc: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @Author: liuxing
 * @Date: 2020/5/14 23:07
 * @Version 1.0
 */
public class ReverseTest {
    public static void main(String[] args) {
        System.out.println(reverse(-1256));
    }

    private static int reverse(int x) {
        long k = 0;
        while (x != 0){
            k <<= 1;
            k *= 5;

            k += x%10;

            x >>= 1;
            x /= 5;
        }
        return (k<Integer.MIN_VALUE || k>Integer.MAX_VALUE) ? 0:(int)k;
    }

}
