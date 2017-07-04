#include <stdlib.h>
#include <stdio.h>
#include <iostream>
#include "Stack.h"

using namespace std;

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

		void printList() {
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


		void removeNth(int n){

		
}

		void deleteList(){
			curr = top;
			while(curr){
				curr= top->next;
				delete(top);
				top = curr;
			}	
		}		
};
