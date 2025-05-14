package LEETCODE;
/*

    [    QNO   ] 2
    [  TITLE   ] Add Two Numbers
    [DIFFICULTY] Medium
    [    URL   ] https://leetcode.com/problems/add-two-numbers/description/
    [   HINT   ] []
    [  IMAGES  ] ['/Users/shashanktiwari/IdeaProjects/MYPROJ/src/LEETCODE/LT2_EX0.png']
    [   DESC   ]:
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 
Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

 
Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.



*/ 

 // CODE BELOW // 




public class LT2{
    
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null, save = null;
        int carry = 0;

        while (l1 != null || l2 != null){
            int sum = carry;

            if(l1!=null){sum += l1.val; l1 = l1.next;}
            if(l2!=null){sum += l2.val; l2 = l2.next;}

            carry = sum/10;
            sum = sum % 10;

            if(res == null){
                res = new ListNode(sum);
                save = res;
            }
            else{
                res.next = new ListNode(sum);
                res = res.next;
            }


        }
        if(carry > 0){
            res.next = new ListNode(carry);
        }
        return save;
    }
}

    public static void main(String[] args) {
        Solution solution = new LT2().new Solution();

        System.out.println(" [33m EXAMPLE 0: [0m ");

//ListNode l1 = [2,4,3];
//ListNode l2 = [5,6,4];
//System.out.println(solution.addTwoNumbers(l1,l2));System.out.println(" [33m EXAMPLE 1: [0m ");
//
//l1 = [0];
//l2 = [0];
//System.out.println(solution.addTwoNumbers(l1,l2));System.out.println(" [33m EXAMPLE 2: [0m ");
//
//l1 = [9,9,9,9,9,9,9];
//l2 = [9,9,9,9];
//System.out.println(solution.addTwoNumbers(l1,l2));

    }

}
