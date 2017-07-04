public class Heap<T> {
	ArrayList<T> al = new ArrayList<T>();		

	Heap<T>(T[] a){
		for(T elem: a){
			while(al.get(elem) < al.get(getparent(elem))){
				elem = elem ^ getparent(elem);
				getparent(elem) = getparent(elem) ^ elem;
                                elem = elem ^ getparent(elem);
				elem = getparent(elem);:

			}
		}		 
	}
	
	int getParent(int index){
		return al.get(index/2);
	}
	int getLeftChild(int index){
		return index*2;
	}
	int getRightChild(int index){
		return index*2+1;
	}

		


	public static void main(String[] args){
			int[] a = {5,4,2,1,5,6,7,8,3,2};
			Heap<Integer> h = new Heap<Integer>(a);
			
	}
}
