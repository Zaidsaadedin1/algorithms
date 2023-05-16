package sort_algo;

public class insertionSort {
    public void insertionSorts(int [] arrays){
        for (int i=0;i<arrays.length;i++){
            int min=i;
            for (int j=i+1;j<arrays.length;j++){
                if (arrays[min]>arrays[j]){
                    min=j;
                }
                int temp=arrays[i];
                arrays[i]=arrays[min];
                arrays[min]=temp;
            }
        }
    }
}
