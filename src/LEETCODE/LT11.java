package LEETCODE;
/*

    [    QNO   ] 11
    [  TITLE   ] Container With Most Water
    [DIFFICULTY] Medium
    [    URL   ] https://leetcode.com/problems/container-with-most-water/
    [   HINT   ] ['If you simulate the problem, it will be O(n^2) which is not efficient.', 'Try to use two-pointers. Set one pointer to the left and one to the right of the array. Always move the pointer that points to the lower line.', 'How can you calculate the amount of water at each step?']
    [  IMAGES  ] ['/Users/shashanktiwari/IdeaProjects/MYPROJ/src/LEETCODE/LT11_EX0.png']
    [   DESC   ]:
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
 
Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:

Input: height = [1,1]
Output: 1

 
Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104



*/ 

 // CODE BELOW // 




public class LT11{
    
class Solution {
    public int maxArea(int[] height) {
        int res = -1;

        int l = 0, r = height.length - 1;

        while (l < r){
            int width = r-l;
            int minHeight = Math.min(height[l], height[r]);

            int area = width * minHeight;

            res = Math.max(res, area);

            if(height[l] < height[r]){
                l++;
            }
            else {
                r--;
            }
        }


        return res;
    }
}

    public static void main(String[] args) {
        Solution solution = new LT11().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

int[] height = {1,8,6,2,5,4,8,3,7};
System.out.println(solution.maxArea(height));System.out.println(" [33m EXAMPLE 1: [0m ");

height = new int[]{1,1};
System.out.println(solution.maxArea(height));

    }

}
