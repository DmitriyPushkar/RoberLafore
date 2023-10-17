package Sorting.InsertSort;

public class ArrayIns {
    private long[] arr;
    private int nElems;

    public  ArrayIns(int max){
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
    public void insertionSort() {
        int out;
        int in;
        for(out=1; out<nElems; out++){
            long temp=arr[out];
            in=out;
            while (in>0&&arr[in-1]>=temp){
                arr[in]=arr[in-1];
                --in;
            }
            arr[in]=temp;
        }
    }

}
