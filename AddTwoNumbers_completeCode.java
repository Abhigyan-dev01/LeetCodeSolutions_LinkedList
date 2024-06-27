  package practice;

import java.util.Iterator;
import java.util.Scanner;



// CLASS FOR CREATING LINKED LIST NODE

class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int val, ListNode next) { 
	    	 this.val = val; 
	    	 this.next = next; 
	     }	     
}





public class AddTwoNumbersInLinkedList {

static int carry=0;   //VARIABLE TO KEEP TRACK OF CARRY

public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
{
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

public static ListNode createNewNode(int a,int b)
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


public static ListNode createNewNode(int carry)
{
	
	ListNode tempListNode=new ListNode(carry, null);
	return tempListNode;
}
	
public static void display(ListNode list)
{
	ListNode iterator=list;
	while(list!=null)
	{
		if(list==null)
		{
			System.out.print("["+list.val+"]");
		}
		System.out.print("->["+list.val+"]");
		list=list.next;
		
			
		
	}
	System.out.println("");
}





public static void main(String []args) 
{	
	
	ListNode list1=null,list2=null,temp=null,prev=null;
	int element;
	Scanner inScanner=new Scanner(System.in);
	
	System.out.println("Enter the number of elements in linkedlist1 and linkedlist2");
	int n1=inScanner.nextInt();
	int n2=inScanner.nextInt();
	
	System.out.println("Enter numbers of linkedlist 1");
	
	for(int i=0;i<n1;i++)
	{
		element=inScanner.nextInt();
		if(list1==null)
		{
			temp=new ListNode(element,null);
			list1=temp;
			prev=temp;
		}
		else {
			temp=new ListNode(element,null);
			prev.next=temp;
			prev=temp;
		}
	}
	
	prev=null;
	temp=null;
	
	System.out.println("Enter numbers of linkedlist 2");
	
	for(int i=0;i<n2;i++)
	{
		element=inScanner.nextInt();
		if(list2==null)
		{
			temp=new ListNode(element,null);
			list2=temp;
			prev=temp;
		}
		else {
			temp=new ListNode(element,null);
			prev.next=temp;
			prev=temp;
		}
	}	
	
	if(list1!=null)
	{
		System.out.print("Numbers in linked list1");
		display(list1);
		System.out.println("\n");
		
	}
	if(list2!=null)
	{
		System.out.print("Numbers in linked list2");
		display(list2);
		System.out.println("\n");
		
	}
	ListNode result=addTwoNumbers(list1,list2);	
	
	
	if(result!=null)
	{
		System.out.print("SumList");
		display(result);
	}  
}



}
