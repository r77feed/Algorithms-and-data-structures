import java.util.*;  	
public class Fill{

	void fill(int x, int y, int paintValue, int matrix [][],int din[][]){
		if (din[x][y] == 0){
			din[x][y]=1;
			if (matrix[x][y] == paintValue)
			{
				System.out.println(x+" "+y);
				matrix[x][y] = 2;
				if (x-1>0) fill(x-1,y,paintValue,matrix,din);
				if (x+1<matrix.length) fill(x+1,y,paintValue,matrix,din);
				if (y-1>0) fill(x,y-1,paintValue,matrix,din);
				if (y+1<matrix[0].length) fill(x,y+1,paintValue,matrix,din);
			}}
			
	}

	public static void main(String[] args){
		int matrix[][]= new int[5][5];
		int din[][]= new int[5][5];
		Random r = new Random();
		for (int i=0; i< matrix.length-1;i++)
			for(int j=0;j < matrix[i].length-1;j++)
			{
				matrix[i][j] = r.nextInt(2);
			}

		for (int i=0; i< matrix.length-1;i++){
			for(int j=0;j < matrix[i].length-1;j++)
				{System.out.print(matrix[i][j]+ " ");}
			System.out.println();}

		new Fill().fill(3,2,matrix[3][2], matrix,din);


		for (int i=0; i< matrix.length-1;i++){
		for(int j=0;j < matrix[i].length-1;j++)
			{System.out.print(matrix[i][j]+ " ");}
		System.out.println();}

	}	
}
