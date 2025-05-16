package LEETCODE;
/*

    [    QNO   ] 9
    [  TITLE   ] Palindrome Number
    [DIFFICULTY] Easy
    [    URL   ] https://leetcode.com/problems/palindrome-number/
    [   HINT   ] ['Beware of overflow when you reverse the integer.']
    [  IMAGES  ] []
    [   DESC   ]:
Given an integer x, return true if x is a palindrome, and false otherwise.
 
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 
Constraints:

-231 <= x <= 231 - 1

 
Follow up: Could you solve it without converting the integer to a string?

*/ 

 // CODE BELOW // 




public class LT9{
    
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){return false;}

        int BASE = Integer.MAX_VALUE/10;

        int temp = x;
        int rev = 0;
        while (x > 0){

            if(rev > BASE){return false;}
            if(rev == BASE){
                if(x % 10 > 7){return false;}
            }

            rev = rev * 10 + (x%10);
            x/=10;
        }

        return temp == rev;
    }
}

    public static void main(String[] args) {
        Solution solution = new LT9().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

int x = 121;
System.out.println(solution.isPalindrome(x));System.out.println(" [33m EXAMPLE 1: [0m ");

x = -121;
System.out.println(solution.isPalindrome(x));System.out.println(" [33m EXAMPLE 2: [0m ");

x = 10;
System.out.println(solution.isPalindrome(x));System.out.println(" [33m EXAMPLE 3: [0m ");

        x = Integer.MAX_VALUE;
        System.out.println(solution.isPalindrome(x));

    }

}
