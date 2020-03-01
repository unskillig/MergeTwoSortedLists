
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
		
		CustomLinkedList mergedList = mergeTwoSortedLists(liste1, liste2);
		mergedList.print();
		
		
		

	}
	
	public static CustomLinkedList mergeTwoSortedLists(CustomLinkedList liste1, CustomLinkedList liste2) {
		CustomLinkedList mergedList = new CustomLinkedList();
		Node iteratorMergedList = mergedList.getHead();
		Node iteratorListe1 = liste1.getHead();
		Node iteratorListe2 = liste2.getHead();
		
		// erste Node in mergedList setzen
		if(iteratorListe1 != null & iteratorListe2 != null) {
			if(iteratorListe1.getValue() > iteratorListe2.getValue()) {
				mergedList.setHead(iteratorListe2);
				mergedList.setTail(iteratorListe2);
				iteratorMergedList = iteratorListe2;
				iteratorListe2 = iteratorListe2.getNext();
			}
			else {
				mergedList.setHead(iteratorListe1);
				mergedList.setTail(iteratorListe1);
				iteratorMergedList = iteratorListe1;
				iteratorListe1 = iteratorListe1.getNext();
			}
		}
		else {
			System.out.println("Beide Listen weisen keine Nodes auf.");
			return null;
		}
		
		
		while(iteratorListe1 != null || iteratorListe2 != null) {
			
			if(iteratorListe1 != null && iteratorListe2 != null) {
				if(iteratorListe1.getValue() > iteratorListe2.getValue()) {
					iteratorMergedList.setNext(iteratorListe2);
				}
				else {
					iteratorMergedList.setNext(iteratorListe1);
				}
			}
			else if(iteratorListe1 != null) {
				iteratorMergedList.setNext(iteratorListe1);
			}
			
			else if(iteratorListe2 != null) {
				iteratorMergedList.setNext(iteratorListe2);
			}
			
			iteratorMergedList = iteratorMergedList.getNext();
			mergedList.setTail(iteratorMergedList.getNext());
		}
		
		return mergedList;
	}
	
}
