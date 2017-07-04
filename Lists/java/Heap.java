import java.util.ArrayList;

public class Heap<T> {
	ArrayList<T> al = new ArrayList<T>();		

	Heap(T[] a){
		for(T elem: a){
			al.add(elem);
			heapifyUp(al.size());
			}
		}		 
	
	int getParent(int index){
		return index-1/2;
	}
	int getLeftChild(int index){
		return index*2;
	}
	int getRightChild(int index){
		return index*2+1;
	}

	void heapifyUp(int index){
		T elem = al.get(index);
		while(elem < al.get(getParent(index))){
                        elem = getParent(index);
			index = getParent(index);
			}
		al.get(index)=tmp;
	}

	void printall(){
		for (T elem: al){
			System.out.println(" "+elem);
		}
	}
	

	public static void main(String[] args){
			int[] a = {5,4,2,1,5,6,7,8,3,2};
			Heap<Integer> h = new Heap<Integer>(a);
			
	}
}
