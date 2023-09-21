package Arrays.High;

public class HighArray {
    private long[] arr;
    int i;
    int nElems;

    public HighArray(int maxSize) {
        arr=new long[maxSize];
        nElems=0;
    }
    public void insert(long value){
        arr[nElems]=value;
        nElems++;
    }
    public boolean find(long value){
        for(i=0; i<nElems; i++) {
            if (arr[i] == value) {
                break;
            }}
            if (i == nElems) {
                return false;
            } else {
                return true;
            }

    }
    public void delete(long searchKey){
        for(i=0; i<nElems; i++){
            if(arr[i]==searchKey){
                break;
            };
        }
        for(int k=i; k<nElems-1; k++){
            arr[k]=arr[k+1];
        }
        nElems--;
    }
    public void display(){
        for(i=0; i<nElems; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

}
