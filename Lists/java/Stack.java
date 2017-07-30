public class Stack<T> {

	public SimpleNode<T> root;
    public int size;

	public T pop(){
		SimpleNode<T> curNode = new SimpleNode<T>();
		T value = root.data;
		curNode = root;
		root = root.next;
		curNode = null;	
        if (size > 0) size--;
		return value;
		
	}
	public T peek(){
		return root.data;
	}
	public int push(T value){
		if (root==null){
			root = new SimpleNode<T>();
			root.data = value;
		}
		else{
			SimpleNode<T> newNode = new SimpleNode<T>();
			newNode.data = value;
			newNode.next = root;
			root = newNode;
		}
        size++;
		return 0;
	}

	public void printAll(){
		if (root!=null){
			SimpleNode<T> curNode  = new SimpleNode<T>();
			curNode = root;
			while(curNode != null){
				System.out.println(pop()+"! ");
				curNode = curNode.next;
			}
		}
	}

	public static void main(String[] args){

		int a[] = {1,2,3,4,5,12};
		Stack<Integer> s = new Stack<Integer>();
		for (int x :a){
			s.push(x);
		}
		s.printAll();
	}
}
