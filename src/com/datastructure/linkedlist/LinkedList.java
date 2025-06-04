package com.datastructure.linkedlist;

public class LinkedList {
	
	class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			this.next=null;		
		}
	}
	
	Node head;
	
	// Method to insert a new node at the first of the list
	// Time complexity is O(1)
	public void insertAtFirst(int data) {
		//step 1: Create a new node
		Node newNode = new Node(data);
		//step 2: Assign the next of new node to head
		newNode.next = head;
		//step 3: Assign head to new node
		head = newNode;
	}
	
	// Method to insert a new node at the end of the list
	// Time complexity is O(n)
	public void insertAtEnd(int data) {
		// step 1: Create a new node
		Node newNode = new Node(data);
		// step 2: If the list is empty, make the new node as head
		if (head == null) {
			head = newNode;
			return;
		}
		// step 3: Traverse the list to find the last node
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	// Method to insert a new node after a given node
	// Time complexity is O(n)
	public void insertAfter(Node prevNode, int data) {
		// step 1: Check if the given previous node is null
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null.");
			return;
		}
		// step 2: Create a new node
		Node newNode = new Node(data);
		// step 3: Make next of new node as next of prevNode
		newNode.next = prevNode.next;
		// step 4: Move the next of prevNode as newNode
		prevNode.next = newNode;
	}
	
	// Method to delete a node by key
	// Time complexity is O(n)
	public void deleteNode(int key) {
		// step 1: Store head node
		Node temp = head, prev = null;
		// step 2: If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			return;
		}
		// step 3: Search for the key to be deleted, keep track of the previous node
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		// step 4: If key was not present in linked list
		if (temp == null) {
			System.out.println("Key not found in the list.");
			return;
		}
		prev.next = temp.next; // Unlink the node from linked list
	}
	
	// Method to delete a node at a given position
	// Time complexity is O(n)
	public void deleteNodeAtPosition(int position) {
		// step 1: If linked list is empty
		if (head == null) {
			return;
		}
		// step 2: Store head node
		Node temp = head;
		// step 3: If head needs to be removed
		if (position == 0) {
			head = temp.next; // Change head
			return;
		}
		// step 4: Find previous node of the node to be deleted
		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.next;
		}
		// step 5: If position is more than number of nodes
		if (temp == null || temp.next == null) {
			System.out.println("Position is out of bounds.");
			return;
		}
		Node next = temp.next.next; // Store pointer to next node
		temp.next = next; // Unlink the deleted node from list
	}

	// Method to print the linked list
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	// Method to reverse the linked list
	// Time complexity is O(n)
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next; // Store next node
			current.next = prev; // Reverse the link
			prev = current; // Move prev to current node
			current = next; // Move to next node
		}
		head = prev; // Update head to new first node
	}
	
	// Method to find the middle of the linked list
	// Time complexity is O(n)
	public Node findMiddle() {
		Node slow = head;
		Node fast = head;
		if (head != null) {
			while (fast != null && fast.next != null) {
				slow = slow.next; // Move slow pointer by one
				fast = fast.next.next; // Move fast pointer by two
			}
		}
		return slow; // Slow pointer is now at the middle
	}
	
	// Main method to test the linked list operations
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.insertAtEnd(5);

		System.out.println("Original Linked List:");
		list.printList();

		System.out.println("Reversed Linked List:");
		list.reverse();
		list.printList();

		System.out.println("Middle of the Linked List: " + list.findMiddle().data);

		list.deleteNode(3);
		System.out.println("Linked List after deleting node with key 3:");
		list.printList();

		list.deleteNodeAtPosition(2);
		System.out.println("Linked List after deleting node at position 2:");
		list.printList();

	}

}
