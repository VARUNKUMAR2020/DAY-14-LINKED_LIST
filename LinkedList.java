package LinkedList;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null;
		}
	}

	public LinkedList() {
		head = null;
	}

	public void Insert(int val) {
             Node newNode = new Node(val);
             //when list is empty
             if(head==null) 
            	 head = newNode;
             //when list is not empty
             else {
            	 newNode.next = head;
            	 head = newNode;
            	 
             }
	}
	public void Display() {
		Node temp =head;
		while(temp!=null) {
			System.out.println(temp.data + " ");
			temp = temp.next;//jump to next node
		}
	}

	public static void main(String[] args) {
		System.out.println("-------: LINKED LIST BASED PROBLEMS :------");
		LinkedList list = new LinkedList();
		list.Insert(56);
		list.Insert(30);
		list.Insert(70);
		list.Display();
		
	}
}
