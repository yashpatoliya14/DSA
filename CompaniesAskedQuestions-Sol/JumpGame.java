import java.util.*;
public class JumpGame{
	public static void main(String[] args) {
		int[] arr =  {3, 2, 1, 0, 4};
		int i =0;

		while(i<arr.length-1){
			int temp = i;
			i +=  arr[i];
			if(temp==i){
				break;
			}
		}
		if(i==arr.length-1){
			System.out.println(true);
		}else{
			System.out.println(false);

		}
	}
} 