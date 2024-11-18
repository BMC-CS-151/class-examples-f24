import java.util.AbstractMap.SimpleEntry;

public class SimpleHashMap<K,V>  {
    private SimpleEntry<K, V>[] arr;
    private int size;
    private int N = 10001; //capacity

    public SimpleHashMap() {
        arr = new SimpleEntry[N]; 
        size = 0;
    }

    private int hash(K key) {
        //use a composition of h1 and h2
        // h(x) = h2(h1(x))
        // remember % means remainder NOT mod! 
        // remainders can be negative
        int h1 = key.hashCode(); //memory address
        int h2 = h1 % N; 
        return Math.abs(h2);
    }

    public V get(K key) {
       //TODO: if key is in the array, return the corresponding value
       //else return null

        SimpleEntry entry = arr[hash(key)];

        if (entry == null) return null;

        return (V) entry.getValue();
    }

    public V put(K key, V value) {
        //TODO: if k is not in arr, add it and return null
        //else replace with new value and return the old value

        int idx = hash(key); //O(1)

        SimpleEntry entry = arr[idx];

        if (entry == null) {
            arr[idx] = new SimpleEntry(key, value);
        } else {
            V oldValue = (V) entry.getValue();
            arr[idx].setValue(value);
            return oldValue;
        }
        
        size++;
        return null;
    }

    public V remove(K key) {
        //if k exists, remove it from arr and return the associated value
        //if not, return null
        
        int idx = hash(key);
        V oldValue = arr[idx].getValue();

        if (oldValue == null) {
            return null;
        }

        arr[idx] = null;
        size--;
        

        return oldValue;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        //map of everyone's grades
        SimpleHashMap<String, Integer> map = new SimpleHashMap();
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
