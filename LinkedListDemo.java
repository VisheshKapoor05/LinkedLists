package LinkedLists;

public class LinkedListDemo{
	public static void main(String[] args) {
		
		LinkedListOperations linkedList = new LinkedListOperations();
		
		linkedList.insertFirst(70);
		linkedList.insertFirst(56);
		linkedList.insertBetween(30, 70);
		
		linkedList.displayNodesData();
		
	}
}
