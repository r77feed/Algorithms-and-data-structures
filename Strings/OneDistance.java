import java.util.Hashtable;

class OneDistance {

	void levenstein(String s1, String s2){}
	void subsq(String s1, String s2){}

	void trivial(String s1, String s2){
		if (Math.abs(s1.length() - s2.length()) > 1){
			System.out.println("No");
			return;
		}
		if (s1.length() == s2.length()){
			/*
			Hashtable<Character,Integer> h = new Hashtable<Character,Integer>();
			int value=0;
			for (int i=0; i< s1.length();i++){
				if (h.get(s1.charAt(i))!= null)
					value = h.get(s1.charAt(i));
				else
					h.put(s1.charAt(i),0);
				if (value !=0){
					h.put(s1.charAt(i),value++);
					value =0;
				}
			}

			for (int i=0; i< s2.length();i++){
				value = h.get(s1.charAt(i));
				if (value !=0){
					h.put(s1.charAt(i),value--);
					value =0;
				}
			}
			for (int i=0; i<h.size();i++){
				if (h.get(i) !=null &&h.get(i) !=0){
				System.out.println("No");
				return;
				}
			}
			System.out.println("yes1");
			*/
			
			int diff = 0;
			for (int i=0; i< s1.length();i++){
				if (s1.charAt(i) != s2.charAt(i))
					diff++;
			}
			if (diff == 1)
				System.out.println("yes1");
			else 
				System.out.println("no");


		} 
		else {
			String tmp;
			if (s1.length() < s2.length()){
				tmp = s2;
				s2 = s1;
				s1 = tmp;
			}
			for(int i=0; i< s1.length();i++){
				tmp = s1.substring(0,i) + s1.substring(i+1,s1.length());
				if (tmp.equals(s2)){
					System.out.println("yes2");
					return;
				}
			}
			System.out.println("no");
		}

	}
	
	public static void main (String[] args){
		String s1[] = {"mate","abracadabra","tty"};
		String s2[] = {"maze","abracadbra","ttyyy"};
		new OneDistance().levenstein(s1[0],s2[0]);
		new OneDistance().levenstein(s1[1],s2[1]);
		new OneDistance().levenstein(s1[2],s2[2]);

		new OneDistance().subsq(s1[0],s2[0]);
		new OneDistance().subsq(s1[1],s2[1]);
		new OneDistance().subsq(s1[2],s2[2]);

		new OneDistance().trivial(s1[0],s2[0]);
		new OneDistance().trivial(s1[1],s2[1]);
		new OneDistance().trivial(s1[2],s2[2]);

	}
}
