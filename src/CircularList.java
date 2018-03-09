
public class CircularList {
	private Node head;
	private Node tail;
	
	public CircularList() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if(temp == null) {
			return true;
		}else {
			temp = null;
			return false;
		}
	}
	
	public void addToBack(String data) {
		if(isFull()) {
			System.out.println("List is full");
		}else {
			Node temp = new Node(data);
			if(isEmpty()) {
				head = temp;
				tail = temp;
				head.setNext(temp);
			}else {
				tail.setNext(temp);
				temp.setNext(head);
				tail = temp;
			}
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}else {
			head.display();
			Node current = head.getNext();
			while(current != head) {
				current.display();
				current = current.getNext();
			}
		}
	}
	
	public void removeFromFront() {
		if(isEmpty()) {
			System.out.println("Nothing to remove");
		}else {
			if(head == tail) {
				//delete head
				head = null;
				tail = null;
			}else {
				Node temp = head;
				head = head.getNext();
				temp = null;//delete temp
			}
		}
	}
	/**
	 * Searches for an item using the search key, if found
	 * removes it from the list
	 * NB. This method has a bug to be resolved
	 * */
	public String remove(String searchKey) {
		String item = null;
		if( ! isEmpty()) {
			if(head == tail /*if there is only one item in list*/
					|| 
				head.getData().equals(searchKey) //first node has search key
			) {
				if(head.getData().equals(searchKey)) {
					item = head.getData();
					//delete head
					head = null;
					tail = null;
				}
			}else {
				Node prev = head;
				Node current = head.getNext();
				while(current != head) {
					if(current.getData().equals(searchKey)) {
						if(current == tail) {
							tail = prev;
						}
						prev.setNext(current.getNext());
						item = current.getData();
						current = null;//delete current
						
					}
					prev = current;
					current = current.getNext();
				}
			}
		}
		return item;
	}

}
