
public class Driver {

	public static String getAValue() {

		return new String("car");
	}

	public static void main(String[] args) {
		CircularList list = new CircularList();
		// add items to list
		for (int i = 0; i < 4; i++) {
			System.out.println("Adding Item " + i + " to list");
			list.addToBack("Item " + i);
		}
		// delete all items from list
		for (int i = 0; i < 4; i++) {
			System.out.println("Removing item from front");
			list.removeFromFront();
			list.display();
		}

		// add items to list
		for (int i = 0; i < 4; i++) {
			System.out.println("Adding Item " + i + " to list");
			list.addToBack("Item " + i);
		}
		// delete all items from list
		for (int i = 0; i < 4; i++) {
			System.out.println("Removing item "+i);
			String removed = list.remove("Item " + i);
			System.out.println("Removed '"+removed+"'");
			list.display();
		}

	}

}
