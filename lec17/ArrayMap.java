import java.util.AbstractMap.SimpleEntry;

public class ArrayMap<K,V>  {
    //TODO 1: create an instance variable for the underlying array named arr
    private SimpleEntry<K,V>[] arr;
    private int size;

    public ArrayMap() {
        //TODO 2: constructor 
        arr = new SimpleEntry[10];
        size = 0;
    }

    private void expand() {
        //expand
        SimpleEntry<K,V>[] newData = new SimpleEntry[size*2];
        for (int i=0; i < size(); i++) {
            newData[i] = arr[i];
        }

        arr = newData;
    }


    public V get(K key) {
        //TODO 3: loop over underlying array and check if the keys match
        for (int i=0; i<size; i++) {
            if (arr[i].getKey().equals(key)) {
                return arr[i].getValue();
            }
        }
        return null;
    }

    public V put(K key, V value) {
        //TODO 4: 
        //if k is not in arr, add it and return null
        //else replace with new value and return the old value

        if (size()+1 >= arr.length) {
            expand();
        }

        for (int i=0; i<size; i++) {
            if(arr[i].getKey().equals(key)) {
                V oldVal = arr[i].getValue();
                arr[i].setValue(value);
                return oldVal;
            }
        }

        arr[size] = new SimpleEntry(key, value);
        size++;
        return null;
    }

    public V remove(K key) {
        //TODO 5: 
        //if k exists, remove it from arr and return the associated value
        //if not, return null
        for (int i=0; i<size; i++) {
            if(arr[i].getKey().equals(key)) {
                V oldVal = arr[i].getValue();
                
                for (int j=i; j<size; j++) {
                    arr[j] = arr[j+1];
                }

                //arr[size] = null;
                size -=1;
                return oldVal;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        //map of everyone's grades
        ArrayMap<String, Integer> map = new ArrayMap();
        assert map.isEmpty();
        assert map.get("Elizabeth") == null;

        map.put("Elizabeth", 75);
        assert map.get("Elizabeth") == 75;
        assert map.size() == 1;

        map.put("Cinnabon", 100);
        assert map.get("Cinnabon") == 100;

        map.put("Steve", 90);
        assert map.get("Steve") == 90;

        map.put("Dianna", 95);
        assert map.get("Dianna") == 95;
        assert map.size() == 4;

        map.remove("Steve");
        assert map.get("Steve") == null;
        assert map.size() == 3;

        map.put("Elizabeth", 80);
        assert map.get("Elizabeth") == 80;
        assert map.size() == 3;

    }

}
