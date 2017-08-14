public class Permutation{

	public void perm(String s, String out){
		if (s.length()==0) 
			System.out.println(out);
		for (int i=0;i<s.length();i++){
			perm(s.substring(0,i) +s.substring(i+1,s.length()),out+s.charAt(i));
		}

	}

	public static void main (String[] args)
	{
		String s= "AABC";
		Permutation p =new Permutation();
		p.perm(s,"");
	}

}
