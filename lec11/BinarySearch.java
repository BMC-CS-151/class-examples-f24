public class BinarySearch {
    //returns the index of the target (if it exists in data)
    private static int binarySearch(int[] data, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        //1. calculate mid value
        int mid = (low + high) / 2;

        //2. handle 3 cases: equal to, lesser than, greater than
        if (target == data[mid]) {
            return mid;
        } else if (target < data[mid]) {
            //recurse - on the left side of mid
            return binarySearch(data, target, low, mid-1);
        } else if (target > data[mid]) {
            return binarySearch(data, target, mid+1, high);
        }

        //3. did we handle the case where target isn't in data?
    }

    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length);
    }
}
