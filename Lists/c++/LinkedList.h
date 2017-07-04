#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include "AbstractList.h"
#include "SimpleNode.h"
class LinkedList: public AbstractList {
		LinkedList(int lenght, int * array);
		void addItem(int elem);
		void removeNth(int n);
		void printList();
		int getSize();
		int getNth(int n);
		void deleteList();
        void detectPalindrome();
        void inverseFromNth();
        void sort();

};

#endif 
