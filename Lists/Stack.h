#include "AbstractList.h"
#include "SimpleNode.h"

class Stack: public AbstractList {
	public:
		SimpleNode *top;
		SimpleNode *curr;
		int size;
		Stack(int lenght, int * array);
		void push(int elem);
		int pop();
		void printList();
		void removeFirstN(int n);
		int getSize();
		int getNth(int n);
		void removeNth(int n);
		void deleteList();	
};
