public class LCS{
	
	public void len(char[] a, char[] b){
		int matrix[][] = new int[a.length+1][b.length+1];
		for(int i=1;i<=a.length;i++){
			for(int j=1;j<=b.length;j++){
				if (a[i-1]==b[j-1]) 
					matrix[i][j]=matrix[i-1][j-1]+1;
					//matrix[i][j]=Math.max(matrix[i][j-1],matrix[i-1][j]);
				}

		}
	
	for(int i=1;i<=a.length;i++){
		for(int j=1;j<=b.length;j++){
			System.out.print(" "+matrix[i][j]);		
		}
		System.out.println();
	}
}



	public static void main(String[] args){
		String a="RRRASDASDASCDAS";
		String b="SADASCASDCASCRRR";
		new LCS().len(a.toCharArray(), b.toCharArray());
	}
}
