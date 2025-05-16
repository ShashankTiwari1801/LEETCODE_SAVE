package LEETCODE;
/*

    [    QNO   ] 12
    [  TITLE   ] Integer to Roman
    [DIFFICULTY] Medium
    [    URL   ] https://leetcode.com/problems/integer-to-roman/
    [   HINT   ] []
    [  IMAGES  ] []
    [   DESC   ]:
Seven different symbols represent Roman numerals with the following values:



Symbol
Value




I
1


V
5


X
10


L
50


C
100


D
500


M
1000



Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.

Given an integer, convert it to a Roman numeral.
 
Example 1:

Input: num = 3749
Output: "MMMDCCXLIX"
Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places


Example 2:

Input: num = 58
Output: "LVIII"
Explanation:

50 = L
 8 = VIII


Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation:

1000 = M
 900 = CM
  90 = XC
   4 = IV


 
Constraints:

1 <= num <= 3999



*/ 

 // CODE BELOW // 


import java.util.HashMap;

public class LT12{
    
class Solution {
    public String intToRoman(int num) {

        int[] numbers = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] values = new String[]{"I", "IV", "V", "IX", "X", "XL" , "L", "XC", "C", "CD", "D", "CM", "M"};

//        System.out.println(numbers.length + " | " + values.length);

        StringBuilder res = new StringBuilder();

        int I = numbers.length-1;

//        System.out.println("NUM = " + num);

        while (num > 0 && I >= 0){

//            System.out.println(String.format("num = %d | I = %d | value = %s | number = %d", num, I, values[I], numbers[I]));
            while (num >= numbers[I]){
//                System.out.println(String.format("Adding %s removed %d from %d now %d", values[I], numbers[I], num, (num-numbers[I])));
                num -= numbers[I];
                res.append(values[I]);
            }
            I--;
        }

        return res.toString();
    }
}

    public static void main(String[] args) {
        Solution solution = new LT12().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

int num = 3749;
System.out.println(solution.intToRoman(num));System.out.println(" [33m EXAMPLE 1: [0m ");

num = 58;
System.out.println(solution.intToRoman(num));System.out.println(" [33m EXAMPLE 2: [0m ");

num = 1994;
System.out.println(solution.intToRoman(num));

    }

}
