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
        int inner;
        int outer;
        for(outer=1; outer<nElems; outer++){
            Person temp=arr[outer];
            inner=outer;
            while (inner>0 && arr[inner-1].getLast().compareTo(temp.getLast())>0){
            arr[inner]=arr[inner-1];
            --inner;
            }
            arr[inner]=temp;
        }
    }
}
