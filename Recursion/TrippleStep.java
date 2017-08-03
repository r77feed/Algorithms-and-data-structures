public class TrippleStep {

	int jump(int n){
		if (n <= 0)
			return 0;
		if (n==1)
			return 1;
		else if (n == 2)
			return 2;
		else
		   return jump(n-1) + jump(n-2) + jump(n-3);	
		 
	}	

	public static void main (String []args){
		int sum = new TrippleStep().jump(21);
		System.out.println(sum);
	}
}
