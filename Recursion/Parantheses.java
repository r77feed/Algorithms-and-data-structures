public class Parantheses{
	void calc(int n, String s, int output){
		if (n == s.length()){
			if  (output == 0)
				System.out.println(s +" ::: "+output);
		}
		else{
			int out1 = output +1;
			int out2 = output -1;
			if (out2 >= 0)
				calc(n,s+")",out2);
			if (out1 < 6)
			calc(n,s+"(",out1);
		}

	}
	public static void main (String [] args){
		new Parantheses().calc(8,"(",1);
	}
}
