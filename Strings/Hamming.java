import java.io.*;

public class Hamming{

		
	public void check(char[] a, char[] b){
		if (a.length!=b.length)
			return;
		int diff=0;
		for(int i=0;i < a.length;i++){
			if (a[i] !=b[i]) diff++;
		}
		System.out.println("Diff " + diff);
	}

	public static void main(String []args){
			String a = "2173896";
			String b = "2233796";
			new Hamming().check(a.toCharArray(),b.toCharArray());
	}
}
