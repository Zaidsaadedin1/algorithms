import search_algo.linearSearch;
import search_algo.binarySearch;
import sort_algo.bubbleSort;
import sort_algo.insertionSort;
import sort_algo.quickSort;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arrays = {3, 5, 6, 7, 8, 9, 442};
        int[] array = {3, 1, 7, 733, 8, 952};
        int length=array.length-1;

        System.out.println("-----------------");
        quickSort q=new quickSort();
        q.quickSorts(array,0,length);

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}