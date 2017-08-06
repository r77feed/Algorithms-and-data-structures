public class Kadene{
	
	int max(int []a){
		int []max = new int[a.length];
		int maxSum = a[0];
		max[0]=a[0];
		for (int i=1; i< a.length;i++){
			if (a[i] + max[i-1] < 0) max[i] = 0; 
			else 
				max[i] = a[i]+max[i-1];
			maxSum = Math.max(maxSum, a[i]+max[i-1]);
		}
		for (int i=0; i< a.length;i++){
			System.out.print(max[i]+" ");
		}
		System.out.println();
		return maxSum;
	}


	int maxnsqr(int a[]){
		int maxSum = a[0];
		int tmpSum = a[0];
		for (int i=1; i< a.length; i++){
			for(int j=i; j>=0; j--){
				tmpSum += a[j];
			}
			if (maxSum < tmpSum){
				maxSum = maxSum ^ tmpSum;
				tmpSum = tmpSum ^ maxSum;
				maxSum = maxSum ^ tmpSum;
			}
			tmpSum = 0;
		}
		return maxSum;
	}
	public static void main(String [] args){
		int a[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(new Kadene().max(a)+"");
		System.out.println(new Kadene().maxnsqr(a)+"");
	}
}
