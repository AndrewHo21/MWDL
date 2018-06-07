package org.mwdl.interview;

public class ReverseLinkedList {

    /**
     * Given Code.
     * Note that this is a static class, but it does not change its functionality, in this case
     *
     * Note the use of non-private fields.
     *  - Using Getters and Setters is not needed
     *
     */
    public static class Node{
        Node next;
        Object data;

        public Node(Object data){
            this.data = data;
        }
    }

    /*
     * Task: Create a method that reverses the ordering of a linked list
     * - A public method
     * - Returns a Node
     * - Takes a Node, the head of a linked list
     * - The Node that is returned is the new head of the list
     *  - Previously the tail
     */


    /**
     * Possible solution
     * Note this is Omega(n), an acceptale solution should be
     *
     * @param head the head of a linked list
     * @return The new head of the list
     */
    public static Node reverse(Node head){
        Node current = null;
        Node last;
        Node next = head;

        while(next != null){
            last = current;
            current = next;
            next = next.next;
            current.next = last;
        }
        return current;
    }

    /**
     * Quick Test, should be able to trace such a test by hand
     */
    public static void main(String[] args) {
        int[] toTest = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node head = new Node(1);
        Node current = head;

        for(int element : toTest){
            Node toAdd = new Node(element);

            current.next = toAdd;
            current = toAdd;
        }


        System.out.println("Original");
        Node currentP = head;
        while (currentP != null){
            System.out.println(currentP.data);
            currentP = currentP.next;
        }


        System.out.println("Reversed");
        Node newHead = reverse(head);
        Node newCurrent = newHead;
        while(newCurrent != null){
            System.out.println(newCurrent.data);
            newCurrent = newCurrent.next;
        }
    }

}