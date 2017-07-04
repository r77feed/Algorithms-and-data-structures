public class LinkedList<T>{

	SimpleNode<T> head;
	int size = 0;


	LinkedList<T>(T a[]){
		if (!a) return;
		for(T elem: a){
			addElem(elem);
		}	
	}

	void addElem(T elem){
		if (!elem) 
			return;
		if (!head){
			head = new SimpleNode<T>();
			head.next = null;
			head.data = elem;
		}
		SimpleNode<T> curr = head;
		while(curr.next){
			curr = curr.next;
		}
		SimpleNode<T> newNode = SimpleNode<T>();
		newNode.data = elem;
		curr.next = newNode;
	}

	void deleteAtIndex(int n){
		if (n<1 || n >getSize()){
			return;
		}
		SimpleNode<T> curr = head;
		int index=0;
                while(curr.next || index < n){
                        curr = curr.next;
			index++;
                }
		SimpleNode<T> newNode = SimpleNode<T>();
                newNode.data = elem;


                curr.next = newNode;

		

	}

	int getSize();
	void printList();

	boolean detectCycle();


	public static void main(String[] args){
		SimpleNode<Integer> sn = new SimpleNode<Integer>();
		sn.data =5;
	}
}
