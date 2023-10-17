package Sorting.SelectSort;

public class ArraySel {
    private long[] arr;
    private int nElems;

    public  ArraySel(int max){
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
   public void selectSort() {
    int out;
    int in;
    int min;
    for(out=0; out<nElems-1; out++){
        min=out;
        for(in=out+1;in<nElems; in++){
            if(arr[min]>arr[in]){
                min=in;
            }
            swap(out,min);
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
