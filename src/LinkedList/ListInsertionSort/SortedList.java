package LinkedList.ListInsertionSort;

import LinkedList.Link.Link;

public class SortedList {
    private Link6 first;
    public SortedList(){
        first=null;

    }
    public SortedList(Link6[] link6Arr){
       first=null;
       for(int i=0; i<link6Arr.length; i++){
           insert(link6Arr[i]);
        }
    }
    public void insert(Link6 key){
        Link6 current=first;
        Link6 previous=null;
        while (current!=null&&key.dData>current.dData){
            previous=current;
            current=current.next;
        }
        if(previous==null){
            first=key;
        }else{
           previous.next=key;
        }
        key.next=current;
    }
    public Link6 remove(){
        Link6 temp=first;
        first=first.next;
        return temp;
    }
}
