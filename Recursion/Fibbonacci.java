import java.util.ArrayList;

public class Fibbonacci {
	ArrayList<Integer> generate(int n){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		for (int i=2; i<n; i++){
			
			a.add((int)a.get(i-1) + (int)a.get(i-2));
		}
		return a;
	}

	public static void main(String[] args){
		ArrayList<Integer>  array = new Fibbonacci().generate(8);
		for (int  a: array)
		{
			System.out.print(a + " ");
		}
	}
}
