    package leetCodeSolutions;

    import java.util.Scanner;

    final class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value=value;
            this.next=null;
        }
    }



    public class LinkedListOperations {



        public static Node createNewNode(int value)
        {
            Node newNode=new Node(value);
            return newNode;
        }

        public static void main(String []args) {
            Node list1Head=null;

            Scanner in = new Scanner(System.in);

            System.out.println("Enter the number of elements");
            int n=in.nextInt();
            System.out.println("Enter elemensts");
            list1Head=AddNodeToLinkedList(n);

            System.out.print("the linked list1");
            Node tracker1=list1Head;

            if(tracker1==null)
            {
                System.out.println("List1->"+null);
            }
            else
            {
                while (tracker1!=null)
                {
                System.out.print("->"+tracker1.value);
                tracker1=tracker1.next;
                }
            }

            Node results=mergeNodes(list1Head);
            if(results==null)
            {
                System.out.println("NUllified");
            }

            System.out.print("the result linked list");
            Node tracker2=results;

            if(tracker2==null)
            {
                System.out.println("List2->"+null);
            }
            else
            {
                while (tracker2!=null)
                {
                    System.out.print("->"+tracker2.value);
                    tracker2=tracker2.next;
                }
            }




        }

        public static Node AddNodeToLinkedList(int n) {

            Scanner in=new Scanner(System.in);
            Node list=null;
            Node marker=null;

            for(int i=0;i<n;i++)
            {
                Node temp=createNewNode(in.nextInt());
                if(list==null)
                {
                    list=temp;
                    marker=temp;
                }
                else
                {
                    marker.next=temp;
                    marker=temp;
                }
            }

            return list;


       }



        public static Node mergeNodes(Node head) {
            Node resultList=null;
            Node marker=null;
            int sum=0;
            int count=0;
            while(head!=null)
            {
                if(head.value==0)
                {
                    count++;
                }
                if(count==2)
                {
                    Node temp=new Node(sum);
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
                    sum+= head.value;

                }
                head=head.next;
            }
        return resultList;

        }
    }
