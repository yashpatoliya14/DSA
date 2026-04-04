import java.util.*;

public class DominantArray{
	
/*
	@params int[] arr
	
	@output int[]

	@description 
	// A dominant number is a number whose frequency of occurrence in an array is strictly greater than the
	// count of unique elements present in that array.
	// You are given an integer array.
	// Your task is to identify and return all dominant numbers from the array.

*/

	private static List<Integer> findDominantArray(int[] arr){
		//solution
		HashMap<Integer,Integer> map = new HashMap<>();
		List<Integer> ans = new LinkedList<>();
		for (int i=0; i<arr.length ; i++ ) {
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i]) + 1);
			}else{
				map.put(arr[i],1);
			}
			System.out.println(map);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= map.size()) {
                ans.add(entry.getKey());
            }
        }

		return ans;

	}

	public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3};

        List<Integer> result = findDominantArray(arr);
        System.out.println(result);
    }
}