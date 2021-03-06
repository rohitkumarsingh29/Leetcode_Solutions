/**
 * Problem2
 */
public class Problem2 {

    

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
    /**
     * ListNode
     */
    public class ListNode {
        int val;
        ListNode next;
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;        
        ListNode resultHead = null;
        ListNode head = null;
        while (l1 != null || l2 != null){
            int temp = 0;
            if (l1 != null){
                temp+=l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                temp += l2.val;
                l2 = l2.next;
            }
            temp+=carry;
            carry = temp/10;
            temp = temp%10;
            ListNode ll = new ListNode(temp,null);
            if (resultHead != null){
                resultHead.next = ll;
            }
            resultHead = ll;
            if (head == null) head = resultHead;
        }
        if (carry != 0){
            ListNode ll = new ListNode(carry,null);
            if (resultHead != null) resultHead.next = ll;
            resultHead = ll;
        }
        return head;
        
    }
    
}
}