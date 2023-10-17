package Sorting.BubbleSort;

public class ArrayBub {
    private long[] arr;
    private int nElems;

    public  ArrayBub(int max){
        arr=new long[max];
        nElems=0;
    }
public void insert(long value){
        arr[nElems]=value;
        nElems++;
}
public void display(){
        for(int i=0; i<nElems; i++){
            System.out.print(arr[i]+ " ");

        }
    System.out.println();
}
public void bubbleSort(){
        int in;
        int out;
        for(out=nElems-1; out>=1; out--){
            for(in=1; in<nElems; in++){
                if(arr[in]<arr[in-1]){
                    swap(in,in-1);
                }
            }
        }
}
public void swap(int index1, int index2){
        long temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
}

}

