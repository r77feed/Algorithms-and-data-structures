#include <stdlib.h>
#include <stdio.h>
#include <iostream>
#include "LinkedList.h"
#include "Stack.h"

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


		bool detectPalindrome(){
			Stack s;
			int middle =size /2;
			bool odd = true;
			if (!(size %2) ==0)
				middle = (size /2) -1;
			odd = false;

			curr = root;
			for(int i=0;i<middle;i++){
				s.push(curr);
				curr= curr -> next;
			}
			if (!odd)
				middle +=1;
			for (int i=middle;i++){
				if (!curr == s.pop())
					return false;
				curr = curr -> next;

			}

		}

		void inverseFromNth(int n){
			SimpleNode *before, *after;
			before =root;
			for(int i=0; i<n-1;i++){
				before=before->next;
			}
			while(curr){
				curr = before->next;
				after = curr->next;
				curr->next = before;
				before = curr;


			}
		}
		void sort(){
			

		}

};
