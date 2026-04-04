import java.util.*;

public class SecretCode{
	public static void main(String[] args) {
		String[] sent = {"I love my pet",
			 "A car ran fast",
			 "He bought a hat",
			 "The cat sat on the mat"};
			 String[] ansStr = {"I love my pet",
			 "A car ran fast",
			 "He bought a hat",
			 "The cat sat on the mat"};

		String code = "cat";
		Map<Integer,String> ans = new TreeMap<>(Collections.reverseOrder());
		for (String s : sent ) {
			String[] words = s.split(" ");
			int mainCount =0;
			for (String w : words ) {
				int count = 0;
				if(w.length()==code.length()){

					for (int i=0; i<code.length() ; i++ ) {
						if(w.charAt(i)==code.charAt(i)){
							count++;
						}
					}
					mainCount +=count;
					count = 0;
				}
			}
			ans.put(mainCount,s);
		}
		for (Map.Entry<Integer,String> s: ans.entrySet() ) {
			System.out.print(s.getValue() + " ");
		}
	}
}