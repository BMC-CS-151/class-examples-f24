public class ExpandableArray {

  //TODO 1: Private member variables
  private int[] data;
  private int size; 
    
  //TODO 2: Define a value constructor which takes an initial size
  public ExpandableArray(int capacity) {
        data = new int[capacity];
        size = 0;
  }
  

  //TODO 3: 
  // Define an insert method which takes an element to insert 
  //        and inserts it at the end of the array
  //
  // assume our internal array isnt full
  // what should we do if our array is full? You'll implement this in Lab 2 
  //
  // how could we define an insert which puts an element at the beginning?
  // You'll also implement this in Lab 2

  public void insert(int elem){
      //check if full, if so, create a new array of 2x size and copy everything over
      data[size] = elem;
      size++; //size += 1, size = size + 1;
  }

  /*
  public void insertAtFirst(int elem)  {
        //chek if full and expand if necessary
        //copy everything over 
        //0th element goes to first slot
        //first element goes to second slot and so on
  }*/



  //TODO 4: 
  // Define a get method which takes an index 
  //    and returns the element at that index
  //
  // assume index is in bounds
  // How could we handle it if index is out of bounds?
  // You'll also implement this in Lab 2

  public int get(int index) {
        return data[index];
  }

  public void print() {
    System.out.println("Data:");
    for (int i=0; i < this.size; i++) {
      System.out.println(data[i]);
    }
  }

  public static void main(String[] args) {
    //int[] x = new int[]{1, 2, 3}; /
    ExpandableArray e = new ExpandableArray(3);
    e.insert(100);
    e.insert(15);
    e.insert(3);
    e.print();

    //e.remove(1);
    //e.print();

    System.out.println(e.get(0));
  }
}
