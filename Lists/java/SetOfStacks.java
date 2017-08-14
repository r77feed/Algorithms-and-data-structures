import java.util.*;
public class SetOfStacks{
	ArrayList<Stack> al = new ArrayList<Stack>();
	int maxSize;
	SetOfStacks(int n){
		this.maxSize = n;
	}
	void push(int x){
		Stack<Integer> curStack;
		if (al.size() < 1){
			curStack = new Stack<Integer>();
			curStack.push(x);
			al.add(curStack);
		}
		else{
			curStack = al.get(al.size()-1);
			//System.out.println("SetStack size: "+al.size() + " current size: "+curStack.size);
			if (curStack.size > maxSize-1){
				curStack = new Stack<Integer>();
				curStack.push(x);
				al.add(curStack);
			}
			else {
				curStack.push(x);
			}
		}
	}

	int pop(){
		Stack<Integer> curStack;
		int x=0;
		if (al.size() < 0)	
			return 0;
		curStack = al.get(al.size()-1);
		if (curStack.size >= 1)
			x = curStack.pop();
		if (curStack.size==0)
{
			//System.out.println(al.size()+" !!!");
			al.remove(al.size()-1);
		return x;
	}

	int popAt(int index){
		return 0;
	}

	void printAll(){
		for(int i=0; i< al.size(); i++){
			System.out.println(i + " -----------------------");
			al.get(i).printAll();
		}
	}

	public static void main(String []args){
		SetOfStacks s = new SetOfStacks(5);
		int []a= {43,4,3,2,5,6,32,0,42,3,24,23,42,34,23,4,123,7};
		for (int x:a){
			s.push(x);
		}

		s.printAll();
		
	}
}
