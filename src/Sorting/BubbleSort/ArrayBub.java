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
        int outer;
        int inner;
        for(outer=nElems-1; outer>1;outer--){
            for(inner=0; inner<outer; inner++){
                if(arr[inner]>arr[inner+1]){
                    swap(inner,inner+1);
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

