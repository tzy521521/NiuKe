package Sort;

/**
 * Created by tzy on 2017/10/6.
 */
public class InsertionSort {
    public static void insertionSort(int[] list){
        for (int i = 1; i <list.length ; i++) {
            int currentElement=list[i];
            int k;
            for (k=i-1;k>=0;k--) {
                if (list[k]>currentElement)
                    list[k+1]=list[k];
                else
                    break;
            }
            list[k+1]=currentElement;
        }
    }
}
