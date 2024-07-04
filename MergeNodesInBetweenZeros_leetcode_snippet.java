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
    public ListNode mergeNodes(ListNode head) {
        ListNode resultList=null;
            ListNode marker=null;
            int sum=0;
            int count=0;
            while(head!=null)
            {
                if(head.val==0)
                {
                    count++;
                }
                if(count==2)
                {
                    ListNode temp=new ListNode(sum);
                    if(resultList==null)
                    {
                        resultList=temp;
                        marker=temp;
                    }
                    else
                    {
                        marker.next=temp;
                        marker=temp;
                    }
                    count=1;
                    sum=0;
                }
                else
                {
                    sum+= head.val;

                }
                head=head.next;
            }
        return resultList;
    }
}
