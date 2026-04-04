import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    static int helper(ArrayList<Integer> arr, int i, int j) {
        int k = i;
        int pivot = i;
        int l = j + 1;

        do {
            k++;
        } while ( k<=j && arr.get(k) <= arr.get(pivot) );

        do {
            l--;
        } while (arr.get(l) > arr.get(pivot));

        while (k < l) {
            int temp = arr.get(k);
            arr.set(k, arr.get(l));
            arr.set(l, temp);

            do {
                k++;
            } while (arr.get(k) <= arr.get(pivot));

            do {
                l--;
            } while (arr.get(l) > arr.get(pivot));

        }
        int t = arr.get(l);
        arr.set(l, arr.get(pivot));
        arr.set(pivot, t);

        return l;
    }

    static void quicksort(ArrayList<Integer> arr, int i, int j) {

        if(i<j){
            int pivotI = helper(arr, i, j);
        quicksort(arr, i, pivotI - 1);
        quicksort(arr, pivotI + 1, j);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(12, 2, 15, 2, 1, 6, 5, 7, 4, 6, 4));

        quicksort(arr, 0, arr.size()-1);
        System.out.println(arr);
    }
}