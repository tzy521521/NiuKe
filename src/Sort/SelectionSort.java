package Sort;

/**
 * Created by tzy on 2017/10/6.
 */
public class SelectionSort {
    public static void selectionSort(int[] list){
        for (int i = 0; i <list.length ; i++) {
            int currentMin=list[i];
            int currentMinIndex=i;
            for (int j = i+1; j <list.length ; j++) {
                if (list[j]<currentMin){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            list[currentMinIndex]=list[i];
            list[i]=currentMin;
        }
    }
}
