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
   int outer;
   int inner;
   for(outer=1; outer<nElems;outer++){
       long temp=arr[outer];
       inner=outer;
       while(inner>0 && arr[inner-1]>=temp){
           arr[inner]=arr[inner-1];
           --inner;
       }
       arr[inner]=temp;
   }
    }

}
