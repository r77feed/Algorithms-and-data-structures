#ifndef ABSTRACTLIST_H
#define ABSTRACTLIST_H

class AbstractList {
	public:
		virtual int getSize()=0;
		virtual int getNth(int n)=0;
		virtual void deleteList()=0;
		virtual void printList()=0;
		virtual void removeNth(int n)=0;
};

#endif /* ABSTRACTLIST_H */
