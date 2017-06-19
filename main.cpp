#include <stdlib.h>
#include <stdio.h>
#include <iostream>

using namespace std;

struct SimpleNode {
	int data;
	SimpleNode * next;
};

class AbstractList {
public:
	virtual int getSize()=0;
	virtual int getNth(int n)=0;
	virtual void deleteList()=0;
};

class LinkedList: public AbstractList {
public:
	SimpleNode *root = NULL;
	SimpleNode *last = NULL;
	SimpleNode *curr = NULL;
	int size = 0;

	LinkedList(int lenght, int * array) {
		for (int i = 0; i < lenght; i++) {
			addItem(array[i]);
		}
	}
	/*
	 ~LinkedList() {
	 curr = root;
	 while (curr) {
	 last = curr;
	 curr = last->next;
	 if (curr)
	 delete last;
	 }
	 }
	 */
	void addItem(int elem) {
		if (!root) {
			root = new SimpleNode;
			root->data = elem;
			root->next = NULL;
			last = root;

		} else {
			curr = new SimpleNode;
			curr->data = elem;
			curr->next = NULL;
			last->next = curr;
			last = curr;
		}
		size++;
	}

	void printList() {
		if (!root)
			return;
		curr = new SimpleNode;
		curr = root;
		while (curr != NULL) {
			cout << curr->data << " ";
			curr = curr->next;
		}
	}

	int getSize() {
		return size;
	}

	int getNth(int n) {
		curr = new SimpleNode;
		curr = root;
		int counter = 0;
		while (counter < n) {
			curr = curr->next;
			counter++;
		}
		return curr->data;
	}

		void deleteList(){
			curr = root;
			while(curr){
				last = curr;
				curr=curr->next;
				if (last) delete last;

			}
		}
};

class Stack: public AbstractList {
public:
	SimpleNode *top = NULL;
	SimpleNode *curr = NULL;
	int size = 0;
	Stack(int lenght, int * array) {
		for (int i = 0; i < lenght; i++) {
			push(array[i]);
		}

	}
	void push(int elem) {
		if (!top) {
			top = new SimpleNode();
			top->next = NULL;
			top->data = elem;
		} else {
			curr = new SimpleNode();
			curr->data = elem;
			curr->next = top;
			top = curr;
		}
		size++;
	}
	int pop() {
		if (!top)
			return 0;
		curr = top;
		int value = curr->data;
		top = top->next;
		delete (curr);
		size--;
		return value;

	}

	void printStack() {
		curr = top;
		while (curr) {
			cout << curr->data << " ";
			curr = curr->next;
		}
		cout << endl;
	}

	void removeFirstN(int n) {
		for (int i = 0; i < n; i++) {
			pop();
		}
	}

	int getSize() {
		return size;
	}

	int getNth(int n) {
		curr = top;
		int counter = 0;
		while (counter < n) {
			curr = curr->next;
		}
		return curr->data;
	}
};

int main() {
	int array[] = { 4, 1, 3, 2, 1, 7, 9, 0, 4, 2 };
	int size = sizeof(array) / sizeof(*array);

	AbstractList *abs;

	abs = new LinkedList(size, array);
	//abs = new Stack(size, array);
	//cout << abs->getNth(2) << endl;

	abs->deleteList();

	//delete abs;
}

