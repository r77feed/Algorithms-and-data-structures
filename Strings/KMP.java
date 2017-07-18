public class KMP{

	public void detect(String s, String p){
		int array[] = new int[p.length()];
		int i=0;
		int j=1;
		boolean b=false;
		while(j<p.length()){
			if (p.charAt(i) == (p.charAt(j))){		
				array[j]=array[i]+1;
				i++;
				j++;
				}
			else{
				b=false;
				while(i>0 && !b){
					if (i-1>= 0) i--;
					if (p.charAt(i) == p.charAt(j)){
						array[j]=array[i]+1;
						j++;
						b=true;
						}
				}
				array[j] = 0;
				j++;

				}
		}

	for(int k=0;k<array.length;k++){
		System.out.print(" "+array[k]);
		}

	}


	

	public static void main (String[] args){
		String s = "AABAACAADAABAABA";
		String pattern = "AAABAAA";
		new KMP().detect(s,pattern);
	}
}
