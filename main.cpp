#include "Lists/LinkedList.h"
#include "Lists/Stack.h"


int main() {
	int array[] = { 4, 1, 3, 2, 1, 7, 9, 0, 4, 2 };
	int size = sizeof(array) / sizeof(*array);

	AbstractList *abs;

	//abs = new LinkedList(size, array);
	abs = new Stack(size, array);
	//cout << abs->getNth(2) << endl;
	abs->printList();
	//	abs->deleteList();
	abs->deleteList();

	abs->printList();
	//delete abs;

}

