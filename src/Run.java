
public class Run {

	public static void main(String[] args) {
		CustomLinkedList liste1 = new CustomLinkedList();
		liste1.addNodeTail(new Node(4));
		liste1.addNodeTail(new Node(7));
		liste1.addNodeTail(new Node(9));
		liste1.addNodeTail(new Node(11));
		liste1.print();
		
		CustomLinkedList liste2 = new CustomLinkedList();
		liste2.addNodeTail(new Node(3));
		liste2.addNodeTail(new Node(5));
		liste2.addNodeTail(new Node(8));
		liste2.addNodeTail(new Node(10));
		liste2.print();
		

	}
	
	public void mergeTwoSortedLists(CustomLinkedList liste1, CustomLinkedList liste2) {
		CustomLinkedList mergedList = new CustomLinkedList();
		Node iteratorMergedList = mergedList.getHead();
		Node iteratorListe1 = liste1.getHead();
		Node iteratorListe2 = liste2.getHead();
		
		while(iteratorListe1 != null || iteratorListe2 != null) {
			if(iteratorListe1 != null && iteratorListe2 != null) {
				if(iteratorListe1.getValue() < iteratorListe2.getValue()) {
					if(mergedList.getHead() == null) {
						mergedList.setHead(iteratorListe1);
						mergedList.setTail(iteratorListe1);
						iteratorMergedList = iteratorListe1;
					}
					else {
					
					}
					
				}
			}
		}
	}
	

}
