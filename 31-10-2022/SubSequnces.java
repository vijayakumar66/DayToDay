import java.util.Arrays;
import java.util.LinkedList;

public class NextGrerater {
	public static class Node
	{
		private Node next;
		private int value;
		public Node(int item) {
			this.value=item;
		}
		 public static Node createList(int[] arr) {
			Node head=new Node(arr[0]);
			Node current=head;
			for(int i=1;i<arr.length;i++)
			{
				current.next=new Node(arr[i]);
				current=current.next;
			}
			return head;
		}
	}
	public int[] greaterNode(Node head)
	{
		int length=findLength(head);
		int[] res=new int[length];
		int index=0;
		while(head.next!=null)
		{
			int jump=0;
			int greater=0;
			boolean isFound=false;
			
			Node tem=head.next;
			while(tem!=null)
			{
				jump++;
				if(tem.value>head.value)
				{
					greater=tem.value;
					isFound=true;
					break;
				}
				tem=tem.next;
			}
			if(!isFound) {
				res[index]=0;
				index++;
				head=head.next;
			}
			else {
				for(int i=0;i<jump;i++)
				{
					res[index]=greater;
					index++;
					head=head.next;
				}
			}
		}
		return res;
	}
	private int findLength(NextGrerater.Node head) {
		Node current=head;
		int count=0;
		while(current!=null) {
			current=current.next;
			count++;
		}
		//System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		int[] arr= {2,7,4,3,5};
		Node head=Node.createList(arr);
		System.out.println(Arrays.toString(new NextGrerater().greaterNode(head)) );
	}

}
