package Arrays.Person;

public class ClassDataArray {
    private Person [] arr;
    public int nElems;
    public ClassDataArray(int max){
        arr=new Person[max];
        nElems=0;
    }
public Person find(String searchName){
        int i;
        for(i=0; i<nElems; i++){
            if(arr[i].getLast().equals(searchName)){
                break;
            }
        }
        if(i==nElems){
            return null;
        }else{
            return arr[i];
        }
}
  public void insert(String first, String last, int age){
        arr[nElems]=new Person(first,last,age);
        nElems++;
  }
    public boolean delete(String searchName) {
        int i=0;
        for ( i = 0; i < nElems; i++) {

           if (arr[i].getLast().equals(searchName)) {
                break;
            }}
        if(i==nElems){
            return false;
        }
        for(int k=i; k<nElems; k++){
            arr[k]=arr[k+1];
        }
        nElems--;
        return true;
    }
    public void display(){
        for(int i=0; i<nElems; i++){
            arr[i].displayPerson();
            System.out.println();
        }
    }
    }


