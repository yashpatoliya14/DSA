import java.util.*;
public class NextGreaterElement
{
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 4};
		int max = -1;
		for (int i=arr.length-1; i>0 ; i--) {
			int temp = arr[i];
			if(arr[i]<max){
				arr[i] = max;
			}else{
				arr[i] = -1;
			}
			if(temp>arr[i-1]){
				max = temp;
			}				
		}
		arr[0]=max;
		for (int a : arr ) {
			System.out.println(a);
		}
	}
}