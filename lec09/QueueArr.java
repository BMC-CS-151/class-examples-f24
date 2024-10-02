public class QueueArr{
    private int arr[];
    private int end; //marks the index of the last element
    private int start; //marks the index of the first element

    public QueueArr() {
        arr = new int[100];
        end = 0;
        start = -1;
    }

    public boolean isEmpty() {
        return start != -1;
    }

    public int first() {
        if (isEmpty()) {
            return -1;
        }
        return arr[start+1];
    }

    public void enqueue(int e) {
        arr[end] = e;
        end += 1;
    }

    public int dequeue() {
        //FIFO

        start += 1;
        return arr[start];
    }

}
