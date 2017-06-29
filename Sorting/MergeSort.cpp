#include<iostream>

using namespace std;

void combine(int a[], int left, int right, int mid);

void mergesort(int a[], int left, int right){
    int mid;
    if (left < right){
        mid = (left+right)/2;
        mergesort(a,left,mid);
        mergesort(a,mid+1,right);
        combine(a,left,right, mid);
    }
        
}

void combine(int a[], int left, int right, int mid){
    int i,j = left;
    int k = mid+1;
    int c[50];   

    while(i<=mid && k <=right){
        if (a[i]<a[k]){
            c[j] = a[i];
            j++;
            i++;
            }
        else{
            c[j] = a[k];
            j++;
            k++;
        }
    }

    for (i = left; i < j; i++)

    {
        cout << c[j] << " ";
        a[i] = c[j];

    }
    cout <<endl;

}


int main(){
    int a[] = {1,5,4,2,3,2};
    int size = sizeof(a) / sizeof(*a);
    mergesort(a, 0,size);
    for (int i=0; i< size;i++){
        cout << a[i] << " ";
    }
    cout <<endl;
    return 0;
}
