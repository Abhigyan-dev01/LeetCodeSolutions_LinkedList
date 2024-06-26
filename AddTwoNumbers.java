class Solution {
    int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1=l1,list2=l2,sumList=null,temp=null,marker=null;
	while(true)
	{
		if(list1==null && list2==null)
		{
			if(carry!=0)
			{
				temp=createNewNode(carry);	
                marker.next=temp;
			}
			return sumList;
		}
		else if(list1==null && list2!=null)
		{
			temp=createNewNode(0,list2.val);
			list2=list2.next;
		}
		else if(list1!=null && list2==null) {
			temp=createNewNode(list1.val,0);
			list1=list1.next;
		}
		else {
			temp=createNewNode(list1.val,list2.val);
			list2=list2.next;
			list1=list1.next;
					
		}
		
		if(sumList==null)
		{
			sumList=temp;
			marker=temp;
		}
		else {
			marker.next=temp;
			marker=temp;
		}
	}
    }
public  ListNode createNewNode(int carry)
{
	
	ListNode tempListNode=new ListNode(carry, null);
	return tempListNode;
}
	
    public  ListNode createNewNode(int a,int b)
{
	int sum=a+b;
	if(carry!=0)
	{
		sum+=carry;
		carry=0;
	}
	if(sum>=10)
	{
		carry=sum/10;
		sum=sum%10;
	}
	ListNode tempListNode=new ListNode(sum, null);
	return tempListNode;
}
}
