package sort_algo;

public class quickSort {

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // method to find the partition position
    static int partition(int[] array, int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[low];

        // pointer for greater element
        int j = high;
        int i =low;

        // traverse through all elements
        // compare each element with pivot
        while(i<j) {
            do {
                i++;
            }while (array[i]<=array[pivot]);

            do{
                j--;
            }while (array[j]>array[pivot]);

            if (i<j) {

                swap(array, array[i], array[j]);
            }


            }

        swap(array,array[i],array[j]);


        return j;
    }

    public static void quickSorts(int[] array, int low, int high) {
        if (low < high) {


            int pi = partition(array, low, high);


            quickSorts(array, low, pi - 1);


            quickSorts(array, pi + 1, high);
        }
    }
}



