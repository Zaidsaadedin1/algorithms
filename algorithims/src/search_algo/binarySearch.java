package search_algo;

public class binarySearch {

    public int binarySearchs(int[] array,int target){
        int low=0;
        int max=array.length;

        while(low<max){
            int middle=low+ (max-low)/2;

            if (target>middle){
                low=middle+1;
            }else if(target<middle){
                max=middle-1;
            }else{
                return middle;
            }

        }
        return -1;
    }

}
