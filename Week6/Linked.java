public class Linked{

	Node head;
	Node tail;
	int size;

	Linked(){
		this.size=0;
	}

	public void insertfirst(int val) {
		Node node = new Node(val);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size +=1;
	}

	public void insertlast(int val) {
		if(tail==null) {
			insertfirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next=node;
		tail=node;
		size++;
	}

	public void insert(int val,int index) {
		if(index==0) {
			insertfirst(val);
			return;
		}
		if(index==size) {
			insertlast(val);
			return;
		}
		Node temp=head;
		for (int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		size++;

	}

	public int deletefirst() {
		int val=head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}

	public Node find(int value){
		Node node=head;
		while(node !=null){
			if(node.value==value){
				return node;
			}
			node=node.next;
		}
		return null;

	}

	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}

	public int deletelast() {
		if(size<=1) {
			deletefirst();

		}
		Node secondlast = get(size-2);
		int val = tail.value;
		tail = secondlast;
		tail.next= null;
		return val;
	}

	public int delete(int index){
		if(index==0){
			return deletefirst();
		}
		if(index==size-1){
			return deletelast();
		}
		Node prev = get(index -1);
		int val = prev.next.value;
		prev.next=prev.next.next;
		return val;
	}



	public void display() {
		Node temp = head;
		while(temp !=null) {
			System.out.print(temp.value+" -> ");
			temp=temp.next;
		}
		System.out.println("end");

	}


	public class Node {
		int value;
		Node next;

		Node(int value){
			this.value=value;
		}
		Node(int value, Node next){
			this.value=value;
			this.next=next;
		}


	}
}