package Sorting.ObjectSort;

public class ArrayInOb {
    private Person[] arr;
    private int nElems;
    ArrayInOb(int max) {
        arr=new Person[max];
        nElems=0;
    }
    public void insert(String firstName, String lastName, int age){
        arr[nElems]=new Person(firstName,lastName,age);
        nElems++;
    }
    public void display(){
        for(int i=0; i<nElems; i++){
            arr[i].displayPerson();
            System.out.println();
        }

    }
    public void insertionSort(){
     int in;
     int out;
     for(out=1;out<nElems;out++){
         Person temp=arr[out];
         in=out;
         while(in>0&&arr[in-1].getLast().compareTo(temp.getLast())>0){
             arr[in]=arr[in-1];
             --in;
         }
         arr[in]=temp;
     }
    }
}
