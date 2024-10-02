public class StackLL<E> {
    private int size;
    private LinkedList<E> ll; //DLL with tail

    public StackLL() {
        this.size = 0;
        this.ll = new LinkedList<E>();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E data) {
        ll.insertHead(data);
        size += 1; 
    }

    public E pop() {
        E first = ll.firstElem();
        ll.remove(first);
        return first;
    }

    public E peek() {
        return ll.firstElem();
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); //30

        stack.pop();
        stack.pop();

        System.out.println("Top element after popping: " + stack.peek()); //10
    }
}
