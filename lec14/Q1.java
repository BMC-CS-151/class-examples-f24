public Node rearrangeEvenOdd(LinkedList ll) {
    Node e = ll.head.next;
    Node o = e.next;

    Node oddHead = e.next;
    
    while (e.next != tail && o.next != tail) {
        //e.next = e.next.next;
        e.next = o.next;
        o.next = o.next.next;

        e = e.next;
        o = o.next;
    }   

    e.next = oddHead;

}





public void merge(LinkedList l1, LinkedList l2) {

    Node tracker = l1.head.next;

    while (tracker.next != l1.tail) {
        tracker = tracker.next;
    }

    tracker.next = l2.head.next;


}




