#include <stdlib.h>
#include <stdio.h>
#include <iostream>
#include "LinkedList.h"

using namespace std;

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

		~LinkedList() {
			curr = root;
			while (curr) {
				last = curr;
				curr = last->next;
				if (curr)
					delete last;
			}
		}

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

		void removeNth(int n){
			SimpleNode *tmp;
			if (!root || n <=1){
				return;
			}
	
			curr = root;
			while (curr || n >1) {
				curr=curr->next;
				n--;
			}
			tmp = curr;
			//unfinished
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
