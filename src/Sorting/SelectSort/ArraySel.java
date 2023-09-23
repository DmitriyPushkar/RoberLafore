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
   public void selectSort(){
        int outer;
        int inner;
        int min;
        for(outer=0; outer<nElems-1; outer++){
            min=outer;
            for(inner=outer+1; inner<nElems; inner++){
                if(arr[min]>arr[inner]){
                    min=inner;
            }
                swap(outer, min);
        }
   }}
    public void swap(int index1, int index2){
        long temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
