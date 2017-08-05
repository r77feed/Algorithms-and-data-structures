import java.util.Random;
import java.util.ArrayList;

class Pair{
	int a;
	int b;
	public Pair(int a,int b)
	{
	this.a = a;
	this.b = b;
	}
}

public class RobotPath{

	void reach(int i, int j, int a[][], ArrayList<Pair> al){
		if ((i==6) && (j==4)){
			System.out.println("Yes");
			return;
		}
		else {
			if (i < 6)
				if (a[i+1][j] !=1 && a[i+1][j] != 2) {a[i+1][j] = 2 ;al.add(new Pair(i+1,j)); reach(i+1, j, a,al);}
			if (j < 4)
				if (a[i][j+1] !=1 && a[i][j+1] != 2) {a[i][j+1] = 2 ;al.add(new Pair(i,j+1)); reach(i, j+1, a,al);	}		
			}
	}

	public static void main(String[] args){
		Random r = new Random();
		ArrayList<Pair> a= new ArrayList<Pair>();
		int [][]matrix = new int[7][5];
		for(int i=0;i<7;i++){
			for(int j=0; j<5; j++){
				byte num = 0;;
				if (r.nextInt(9) < 2)
					num = 1;
				matrix[i][j] = num;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		matrix[0][0] = 0;
		new RobotPath().reach(0,0,matrix,a);
		System.out.println();
		for(int i=0;i<7;i++){
			for(int j=0; j<5; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		for (Pair x: a){
			System.out.print(x.a+":"+x.b+" ");
		}


	}
}
