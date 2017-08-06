public class Multiply{
	int m (int a, int b){
		int result=0;
		while (a > 0){
			result = result + b;
			a =a - 1;
		}
		return result;
	}

	int r(int a, int b){
		if (a == 0)
			return 0;
		if (a <= 1)
			return b;
		else
			return b + r(a-1, b);
	}

	public static void main(String[] args){
		int a = 77;
		int b = 2;
		System.out.println(" "+new Multiply().m(a,b));
		System.out.println(" "+new Multiply().r(a,b));
	}
}
