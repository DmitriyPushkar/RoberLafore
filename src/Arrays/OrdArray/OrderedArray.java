package Arrays.OrdArray;

public class OrderedArray {
    private long [] arr;
    int nElems;
    public OrderedArray(int max){
        arr= new long[max];
    }
    public int size(){
        return nElems;
    }
public void insert(long value){
        int i=0;
        for(i=0; i<nElems; i++){
            if(arr[i]>value){
                break;
            }
        }
        for(int k=nElems; k>i; k--){
            arr[k]=arr[k-1];
        }
        arr[i]=value;
        nElems++;

}
public int find(long value){
        int lowerBound=0;
        int upperBound=nElems-1;
        int mid;
        while(true){
            mid=(lowerBound+upperBound)/2;
            if(arr[mid]==value){
                return mid;
            }else if(lowerBound>upperBound){
                return nElems;
            }
            else{
                if(arr[mid]<value){
                    lowerBound=mid+1;
                }
                else{
                    upperBound=mid-1;
                }
            }
        }
}


public boolean delete(long value) {
int i=find(value);
    if(i==nElems){
        return false;
    }else {
        for (int k=i; k<nElems; k++){
            arr[k]=arr[k+1];

        }
        nElems--;
    }
    return true;


    }
public void display(){
        for(int i=0; i<nElems; i++){
            System.out.print(arr[i]+" ");
        }
    System.out.println();
}
}