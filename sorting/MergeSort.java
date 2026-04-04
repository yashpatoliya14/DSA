import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    static void merge(ArrayList<Integer> arr, int i,int k, int j) {
        int start1 = i;
        ArrayList<Integer> temp = new ArrayList<>();
        int start2 = k+1;
        while(start1<=k && start2<=j){
            if(arr.get(start1)>arr.get(start2)){
                temp.add(arr.get(start2));
                start2++;
            }else{
                temp.add(arr.get(start1));
                start1++;
            }

        }

        while(start1<=k){
            temp.add(arr.get(start1));
            start1++;
        }

        while(start2<=j){
            temp.add(arr.get(start2));
            start2++;
        }

            for (int m = 0; m < temp.size(); m++) {
                arr.set(i + m, temp.get(m));
            }   

    }

    static void mergeSort(ArrayList<Integer> arr, int i, int j) {

        if(i<j){
            int mid = (i + j) / 2;
mergeSort(arr, i, mid);
mergeSort(arr, mid + 1, j);
            merge(arr, i,mid,j);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(12, 2, 15, 2, 1, 6, 5, 7, 4, 6, 4));

        mergeSort(arr, 0, arr.size()-1);
        System.out.println(arr);
    }
}