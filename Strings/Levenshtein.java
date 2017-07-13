public class Levenshtein{

	public void check(char[] a, char[] b){
	int matrix[][] = new int [a.length][b.length];
	for (int i=0; i<a.length+1; i++){
		matrix[i][0] = i;
		}
	for (int i=0; i<b.length+1; i++){
		matrix[0][i] = i;
		}
	int bit=1;
	for (int i=1; i<a.length+1; i++){
		for (int j=1; j<b.length+1; j++){
			if (a[i] == b[j]) bit =0;
			matrix[i][j] = min((matrix[i-1][j] +1),(matrix[i][j-1])+1,(matrix[i-1][j-1])+bit);
			bit =1;
		
		}

	}

	for (int i=0; i<a.length+1; i++){
		for (int j=0; j<b.length+1; j++){
			System.out.print(" "+matrix[i][j]);
		}
		System.out.println();
	}

}
	public int min(int a, int b, int c){
		if (a < b)
 			if (a<c) return a;
			else return c;
		else 
			if (b<c)return b;
			else return c;
	}


	public static void main(String[] s){
		String a = "kitten";
		String b = "sitting";
		new Levenshtein().check(a.toCharArray(),b.toCharArray());
	}

}
