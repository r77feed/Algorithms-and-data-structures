public class Rotate{
	void shift(int[] a, int n){

	/*	
		for(int j=0; j<n;j++){
			for(int i=a.length-1; i>0;i--){
				a[i] = a[i] ^ a[i-1];
				a[i-1] = a[i] ^ a[i-1];
				a[i] = a[i] ^  a[i-1];

			}
		}
*/

		for(int j=0; j<n;j++){
			for(int i=0; i<a.length-1;i++){
				a[i] = a[i] ^ a[i+1];
				a[i+1] = a[i] ^ a[i+1];
				a[i] = a[i] ^  a[i+1];

			}
		}

		for(int i=0; i<a.length;i++){
			System.out.println(""+a[i]);
		}

	}

	public static void main(String[] args){
		int[] a= {1,2,3,4,5,6,7};
		new Rotate().shift(a,3);
	}
}
