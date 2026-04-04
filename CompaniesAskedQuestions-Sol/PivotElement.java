// Pivot Index
// Given an array of integers, write a program to find the pivot index.
// A pivot index is an index i in the array such that:
// 1. The sum of all elements to the left of i is equal to the sum of all elements to the right of i.
// 2. The element at the pivot index itself is not included in either sum.
// • If such an index exists, return the first pivot index found.
// • If no pivot index exists, print a message indicating that it was not found.


public class PivotElement{

	public static void main(String[] args) {
		int[] num = {1, 7, 3, 6, 5, 6};
		int totalSum = 0;
		for (Integer i : num ) {
			totalSum += i;
		}
		int leftSum =0;
		boolean flag = true;
		for (int i=0; i<num.length ; i++ ) {
			int rightSum = totalSum - leftSum - num[i];
			if(rightSum == leftSum){
				System.out.println(i);
				flag = false;
				break;
			}
			leftSum +=num[i];
		}
		if(flag){
			System.out.println("No Index Found");
		}

	}
}