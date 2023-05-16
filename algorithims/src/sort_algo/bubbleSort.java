package sort_algo;

public class bubbleSort {
    public int []  bubbleSort(int [] arrays){

        int temp=0;

        for (int i=0;i<arrays.length-1;i++){
            for (int j=0;j<arrays.length-1-i;j++) {
                if (arrays[j] > arrays[j + 1]) {
                    temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }

        return new int [] {};
    }
}
