package LEETCODE;
/*

    [    QNO   ] 13
    [  TITLE   ] Roman to Integer
    [DIFFICULTY] Easy
    [    URL   ] https://leetcode.com/problems/roman-to-integer/description/
    [   HINT   ] ['Problem is simpler to solve by working the string from back to front and using a map.']
    [  IMAGES  ] []
    [   DESC   ]:
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
 
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 
Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].



*/ 

 // CODE BELOW // 


import java.util.HashMap;

public class LT13{
    
class Solution {
    public void makeMap(HashMap<Character, Integer> map){
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    public int romanToInt(String s) {

//        System.out.println(s);

        HashMap<Character, Integer> valueMap = new HashMap<>();
        makeMap(valueMap);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {

            char x = s.charAt(i);
            char y = i == s.length() - 1 ? '-' : s.charAt(i+1);

//            System.out.println(x);

            if((y != '-') && (x == 'I' || x == 'X' || x == 'C')){

                if(x != y){
//                    System.out.println(x + " | " + y);
                    int added = valueMap.get(y) - valueMap.get(x);
                    if(added > 0) {
                        res += added;
//                        System.out.println(String.format("Added ** %d", added));
                        i++;
                        continue;
                    }
                }
            }


//            System.out.println(String.format("Added %d", valueMap.get(x)));
            res += valueMap.get(x);

        }


        return res;
    }
}

    public static void main(String[] args) {
        Solution solution = new LT13().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

String s = "III";
System.out.println(solution.romanToInt(s));System.out.println(" [33m EXAMPLE 1: [0m ");

s = "LVIII";
System.out.println(solution.romanToInt(s));System.out.println(" [33m EXAMPLE 2: [0m ");

s = "MCMXCIV";
System.out.println(solution.romanToInt(s));System.out.println(" [33m EXAMPLE 3: [0m ");

        s = "DCXXI";
        System.out.println(solution.romanToInt(s));

    }

}
