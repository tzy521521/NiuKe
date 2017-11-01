package Sort;

/**
 * Created by tzy on 2017/10/6.
 */
public class Main {
    public static void main(String[] args) {
        int[] list={2,9,5,4,8,1,6};
        SelectionSort.selectionSort(list);
        for (int d:list) {
            System.out.print(d+" ");
        }
        System.out.println();

        int[] list1={2,10,5,4,8,1,6};
        InsertionSort.insertionSort(list1);
        for (int d:list1) {
            System.out.print(d+" ");
        }
        System.out.println();

        int[] list2={2,12,5,4,8,1,6};
        ShellSort.shellSort(list2);
        for (int d:list2) {
            System.out.print(d+" ");
        }
    }
}
