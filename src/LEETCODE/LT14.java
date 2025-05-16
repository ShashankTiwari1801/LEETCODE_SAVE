package LEETCODE;
/*

    [    QNO   ] 14
    [  TITLE   ] Longest Common Prefix
    [DIFFICULTY] Easy
    [    URL   ] https://leetcode.com/problems/longest-common-prefix/description/
    [   HINT   ] []
    [  IMAGES  ] []
    [   DESC   ]:
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 
Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.



*/ 

 // CODE BELOW // 


import java.util.Arrays;

public class LT14{
    
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int I = 0;
        for (int i = 0; i < Math.min(strs[0].length(),strs[strs.length-1].length()); i++) {

            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                break;
            }
            I++;
        }

        return strs[0].substring(0, I);
    }
}

    public static void main(String[] args) {
        Solution solution = new LT14().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

String[] strs = {"flower","flow","flight"};
System.out.println(solution.longestCommonPrefix(strs));System.out.println(" [33m EXAMPLE 1: [0m ");

strs = new String[]{"dog","racecar","car"};
System.out.println(solution.longestCommonPrefix(strs));

    }

}
