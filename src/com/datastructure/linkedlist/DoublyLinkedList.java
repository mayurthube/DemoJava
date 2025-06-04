package com.datastructure.linkedlist;

public class DoublyLinkedList {
	
	class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            this.data=d;
            this.next=null;		
            this.prev=null;
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
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
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
            newNode.prev = current;
            
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
		newNode.prev = prevNode;
	}
    
    //Method to insert a new node before a given node
	// Time complexity is O(n)
	public void insertBefore(Node nextNode, int data) {
		// step 1: Check if the given next node is null
		if (nextNode == null) {
			System.out.println("The given next node cannot be null.");
			return;
		}
		// step 2: Create a new node
		Node newNode = new Node(data);
		// step 3: Make next of new node as next of prevNode
		newNode.prev = nextNode.prev;
		// step 4: Move the next of prevNode as newNode
		nextNode.prev = newNode;
		newNode.next = nextNode;

	}
	
	// Method to delete a node at beginning
	// Time complexity is O(1)
	public void deleteAtFirst() {
		// step 1: Check if the list is empty
		if (head == null) {
			System.out.println("The list is empty.");
			return;
		}
		// step 2: Move head to the next node
		head = head.next;
		if (head != null) {
			head.prev = null;
		}
	}
	
	// Method to delete a node at end
	// Time complexity is O(n)
	public void deleteAtEnd() {
		// step 1: Check if the list is empty
		if (head == null) {
			System.out.println("The list is empty.");
			return;
		}
		// step 2: Traverse the list to find the last node
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		// step 3: If the list has only one node
		if (current.prev == null) {
			head = null;
			return;
		}
		current.prev.next = null;
	}
	
	// Method to delete a node by key
	// Time complexity is O(n)
	public void deleteNodeByKey(int key) {
		// step 1: Check if the list is empty
		if (head == null) {
			System.out.println("The list is empty.");
			return;
		}
		// step 2: Traverse the list to find the node to be deleted
		Node current = head;
		while (current != null && current.data != key) {
			current = current.next;
		}
		// step 3: If the node was not found
		if (current == null) {
			System.out.println("The node with key " + key + " was not found.");
			return;
		}
		// step 4: If the node to be deleted is head
		if (current == head) {
			head = current.next;
			if (head != null) {
				head.prev = null;
			}
			return;
		}
		current.prev.next = current.next;
		if (current.next != null) {
			current.next.prev = current.prev;
		}

	}
	// Method to display the list
	// Time complexity is O(n)
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	// Method to display the list in reverse order
	// Time complexity is O(n)
	public void displayReverse() {
		Node current = head;
		if (current == null) {
			System.out.println("The list is empty.");
			return;
		}
		while (current.next != null) {
			current = current.next;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtFirst(10);
		dll.insertAtFirst(20);
		dll.insertAtEnd(30);
		dll.insertAfter(dll.head, 25);
		dll.insertBefore(dll.head.next, 15);
		System.out.println("Doubly Linked List:");
		dll.display();
		System.out.println("Doubly Linked List in Reverse Order:");
		dll.displayReverse();
		dll.deleteAtFirst();
		System.out.println("After deleting the first node:");
		dll.display();
		dll.deleteAtEnd();
		System.out.println("After deleting the last node:");
		dll.display();
		dll.deleteNodeByKey(25);
		System.out.println("After deleting the node with key 25:");
		dll.display();

	}
}
