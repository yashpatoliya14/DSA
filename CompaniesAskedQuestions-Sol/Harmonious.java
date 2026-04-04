import java.util.*;
public class Harmonious{
	public static void main(String[] args) {
		String str = "ABA";
		char[] ch = str.toCharArray();
		List<String> ss = new LinkedList();
		for (int j = 0; j<ch.length; j++ ) {
			int a = 0;
            int b = 0;

            String temp = "" + ch[j];

			ss.add(temp);
			for (int i=j+1;i<ch.length; i++ ) {
				temp += "" + ch[i];
				ss.add(temp);
			}
		}
		System.out.println(ss);
		List<String> ans = new LinkedList();

		HashMap<String,Integer> freq = new HashMap<>();

		for (String  s: ss ) {
			int a = 0 ;
			int b = 0 ;
			char[] cA = s.toCharArray();
			for(Character c : cA){
				if(c == 'A'){
					a++;
				}else{
					b++;
				}
			}
			if(Math.abs(a-b) == 0 || Math.abs(a-b)==1 || a==0 || b==0){
				ans.add(s);
			}
			
		}
		System.out.println(ans);
	}
} 