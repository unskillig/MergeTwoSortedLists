
public class CustomLinkedList {

	private Node head;
	private Node tail;

	public CustomLinkedList() {
		super();
		this.head = null;
		this.tail = this.head;
	}

	public CustomLinkedList(Node head) {
		super();
		this.head = head;
		this.tail = head;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void addNodeTail(Node newNode) {
		if(head == null) {
			head = newNode;
			tail = head;
		}
		
		else if(tail == null) {
			head.setNext(newNode);
			tail = head.getNext();
		}
		else {
			tail.setNext(newNode);
			tail = tail.getNext();
		}
	}
	
	public void print() {
		Node iterator = this.head;
		System.out.println("Liste");
		while(iterator != null) {
			System.out.println(iterator.getValue());
			iterator = iterator.getNext();
		}
		System.out.println();
	}
}
