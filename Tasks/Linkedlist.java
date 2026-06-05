
public class Linkedlist {
	public static void main(String args[])
	{
		//giving values
		Node first=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		
		//references
		first.next=second;
		second.next=third;
		
		//displaying linkedlist
		Node temp=first;
		while(temp!=null)
		{
			System.out.println(temp.data+ "->");
			temp=temp.next;
			
		}
		System.out.println("null");
		
	}
}
class Node
{
	int data;//declaring
	Node next;
	Node(int data)
	{
		this.data=data;//intializing
		this.next=null;
	}
}
