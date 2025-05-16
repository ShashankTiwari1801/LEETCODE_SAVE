
package LEETCODE;
/*

    [    QNO   ] 5
    [  TITLE   ] Longest Palindromic Substring
    [DIFFICULTY] Medium
    [    URL   ] https://leetcode.com/problems/longest-palindromic-substring/
    [   HINT   ] ['How can we reuse a previously computed palindrome to compute a larger palindrome?', 'If “aba” is a palindrome, is “xabax” a palindrome? Similarly is “xabay” a palindrome?', 'Complexity based hint:</br>\r\nIf we use brute-force and check whether for every start and end position a substring is a palindrome we have O(n^2) start - end pairs and O(n) palindromic checks. Can we reduce the time for palindromic checks to O(1) by reusing some previous computation.']
    [  IMAGES  ] []
    [   DESC   ]:
Given a string s, return the longest palindromic substring in s.
 
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:

Input: s = "cbbd"
Output: "bb"

 
Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.



*/ 

 // CODE BELOW // 




public class LT5{
    
class Solution {


    int L = 0, R = 0;
    public String expandAroundCenter(String s, char[] arr, int l, int r){

        while (l >=0 && r < arr.length  && arr[l] == arr[r]){
            l--;
            r++;
        }

//        System.out.println(s.substring(l+1, r));
        return s.substring(l+1, r);
    }

    public String longestPalindrome(String s) {
        if(s.length() == 1){return s;}
        String res = "";

        for (int i = 0; i < s.length() - 1; i++) {
            String even = expandAroundCenter(s, s.toCharArray(), i,i+1);
            String odd = expandAroundCenter(s, s.toCharArray(), i,i);

            if(even.length() > res.length()){res = even;}
            if(odd.length() > res.length()){res = odd;}
        }
        return res;
    }
}

    public static void main(String[] args) {
        Solution solution = new LT5().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

String s = "babad";
System.out.println(solution.longestPalindrome(s));System.out.println(" [33m EXAMPLE 1: [0m ");

s = "cbbd";
System.out.println(solution.longestPalindrome(s));System.out.println(" [33m EXAMPLE 2: [0m ");

        s = "a";
        System.out.println(solution.longestPalindrome(s));

    }

}
