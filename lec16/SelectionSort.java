public class SelectionSort {

    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void selectionSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            //i is the end index of the cur sorted portion 
            //find the min element in the unsorted portion

            int minIdx = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                } 
            }
            //swap min with the first element in unsorted
            swap(arr, i, minIdx);
        }

    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        //System.out.println(arr);
        selectionSort(arr);
        printArr(arr);
    }

}
