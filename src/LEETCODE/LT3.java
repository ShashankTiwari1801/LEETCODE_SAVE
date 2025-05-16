package LEETCODE;
/*

    [    QNO   ] 3
    [  TITLE   ] Longest Substring Without Repeating Characters
    [DIFFICULTY] Medium
    [    URL   ] https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    [   HINT   ] ["Generate all possible substrings & check for each substring if it's valid and keep updating maxLen accordingly."]
    [  IMAGES  ] []
    [   DESC   ]:
Given a string s, find the length of the longest substring without duplicate characters.
 
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 
Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.



*/ 

 // CODE BELOW // 


import java.util.HashMap;
import java.util.Map;

public class LT3{
    
class Solution {
    public int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> map = new HashMap<>();

        int[] map = new int[150];

        int res = 0;
        int l = 0;

        for (int i = 0; i < s.length(); i++) {

            char x = s.charAt(i);

//            System.out.println(x);


            if(map[x] != 0){
                l = Math.max(l,map[x]);
            }

            res = Math.max(res, i - l + 1);

            map[x] = i+1;
        }

        return res;

    }
}

    public static void main(String[] args) {
        Solution solution = new LT3().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

String s = "abcabcbb";
System.out.println(solution.lengthOfLongestSubstring(s));System.out.println(" [33m EXAMPLE 1: [0m ");

s = "bbbbb";
System.out.println(solution.lengthOfLongestSubstring(s));System.out.println(" [33m EXAMPLE 2: [0m ");

s = "pwwkew";
System.out.println(solution.lengthOfLongestSubstring(s));

    }

}
