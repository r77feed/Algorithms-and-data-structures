import java.util.*;
public class Perm{

	void permute(String s, String result){
		if (s.length() ==0){
			System.out.println(result);
		}
		else{
			for(int i=0; i<s.length(); i++){
				permute(s.substring(0,i)+s.substring(i+1,s.length()),result+s.charAt(i));
			}
		}
	}
	
	public static void main (String []args){
		String s = "acdab";
		Set<Character> treeSet = new TreeSet<>();
		for (int i=0;i < s.length(); i++){
			treeSet.add(s.charAt(i));
		}
		StringBuilder b = new StringBuilder();
		for (int i=0;i < treeSet.size(); i++){
			b.append(treeSet.toArray()[i]);
		}
		new Perm().permute(b.toString(), "");
	}
}
