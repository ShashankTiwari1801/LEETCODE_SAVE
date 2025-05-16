package LEETCODE;
/*

    [    QNO   ] 7
    [  TITLE   ] Reverse Integer
    [DIFFICULTY] Medium
    [    URL   ] https://leetcode.com/problems/reverse-integer/
    [   HINT   ] []
    [  IMAGES  ] []
    [   DESC   ]:
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 
Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

 
Constraints:

-231 <= x <= 231 - 1



*/ 

 // CODE BELOW // 


/*
123
3 | 12 | 0


 */


public class LT7{
    
class Solution {
    public int reverse(int x) {

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);


        boolean isNeg = x < 0;

        x *= isNeg ? -1 : 1;

        int res = 0;

        int BASE = Integer.MAX_VALUE / 10;

        if(x/10 == BASE){return 0;}

        while (x > 0) {

            if (res > BASE){return 0;}
            if (res == BASE) {
                if (x > 7 && !isNeg) {
                    return 0;
                }
                if (x > 8) {
                    return 0;
                }
            }
            res = res * 10 + (x%10);

            x /= 10;
        }

        res *= isNeg ? -1 : 1;

        return res;
    }
}

    public static void main(String[] args) {
        Solution solution = new LT7().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

int x = 123;
System.out.println(solution.reverse(x));System.out.println(" [33m EXAMPLE 1: [0m ");

x = -123;
System.out.println(solution.reverse(x));System.out.println(" [33m EXAMPLE 2: [0m ");

x = 120;
System.out.println(solution.reverse(x));System.out.println(" [33m EXAMPLE 3: [0m ");

        x = 2147483647;
        System.out.println(solution.reverse(x));System.out.println(" [33m EXAMPLE 4: [0m ");

        x = -2147483648;
        System.out.println(solution.reverse(x));

    }

}
