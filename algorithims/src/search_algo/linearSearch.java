package search_algo;

public class linearSearch {
    int value;


    linearSearch(int value){
    this.value=value;

    }
    public linearSearch(){

    }

    public int linearSearchs(int [] array,int value){
        for(int i=0;i<array.length;i++){
            if (array[i]==value){
                return i;
            }

        }
        return -1;
    }
}
