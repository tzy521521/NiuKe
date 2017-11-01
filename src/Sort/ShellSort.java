package Sort;

/**
 * Created by tzy on 2017/10/6.
 */
public class ShellSort {
    public static void shellSort(int[] list){
        //默认步长是数组长度的一半
        int step=list.length;
        while (step!=1){
            step/=2;
            for (int i = 0; i <step ; i++) {
                for (int j = i+step; j <list.length ; j+=step) {
                    int currentElement=list[j];
                    int k;
                    for (k=j-step;k>=0;k-=step) {
                        if (list[k]>currentElement)
                            list[k+step]=list[k];
                        else
                            break;
                    }
                    list[k+step]=currentElement;
                }
            }
        }
    }
}
