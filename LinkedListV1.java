package LinkedList;

class LinkedListV1 {
    private Node head;
    /** Initialize your data structure here. */
    public LinkedListV1() {
        head = null;
    }
    
    public void printList() {
    	Node curr = head;
        while (curr != null) {
        	System.out.print(curr.getValue() + " ");
            curr = curr.getNext();
        }
        System.out.println();
        
    }
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int count = 0;
        Node curr = head;
        while (count < index) {
            curr = curr.getNext();
            count++;
        }
        return curr.getValue();
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        head = new Node(val);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(new Node(val));
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int i = 0;
        Node curr = head;
        while (i < index - 1) {
            curr = curr.getNext();  
            i += 1;
        }
        //System.out.print(curr.getValue());
        Node n2 = curr.getNext();
        Node n1 = new Node(val);
        curr.setNext(n1);
        n1.setNext(n2);
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int count = 0;
        Node curr = head;
        Node next = curr.getNext();
        while (count < (index - 1)) {
            curr = curr.getNext();
            next = next.getNext();
        }
        curr.setNext(next.getNext());
    }
    
    public static void main(String[] args) {
    	LinkedListV1 myLinkedList = new LinkedListV1();
    	myLinkedList.addAtHead(1);
    	myLinkedList.printList();
    	
    	myLinkedList.addAtTail(3);
    	myLinkedList.printList();
    	myLinkedList.addAtIndex(1, 2);  
    	myLinkedList.printList();
    	// linked list becomes 1->2->3
    	System.out.println(myLinkedList.get(1));         
    	myLinkedList.printList();// return 2
    	myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
    	myLinkedList.printList();
    	System.out.println(myLinkedList.get(1));              // return 3
    	
    }
}

class Node {
    private int val;
    private Node next;
    
    public Node(int value) {
        val = value;
        this.next = null;
    }
    
    public int getValue() {
        return val;
    }
    
    public void setValue(int val) {
        this.val = val;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    

}
/**
 * Your LinkedListV1 object will be instantiated and called as such:
 * LinkedListV1 obj = new LinkedListV1();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

