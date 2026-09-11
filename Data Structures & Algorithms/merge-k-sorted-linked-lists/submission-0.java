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
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;

        while(size>1){
            int nuevo = 0;
            for (int i = 0; i < size; i += 2) {
                ListNode segunda = (i + 1 < size) ? lists[i + 1] : null;
                lists[nuevo++] = merge2Lists(lists[i], segunda);
            }
            size = nuevo;
        }

        return size > 0? lists[0]:null;
        
    }

    public ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode resNode;
        ListNode dummyNode = new ListNode(0);

        resNode = dummyNode;
        
        while(l1 != null || l2 != null){
            
            if(l2 == null || (l1 != null && l1.val <= l2.val)){
                resNode.next = l1;
                l1 = l1.next;
                resNode = resNode.next;
                
            }else{
                resNode.next = l2;
                l2 = l2.next;
                resNode = resNode.next;
            }

        }

        return dummyNode.next;
    }
}
