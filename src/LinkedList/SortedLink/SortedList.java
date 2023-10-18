package LinkedList.SortedLink;

import LinkedList.Link.Link;

public class SortedList {
    private Link5 first;
    public SortedList(){
        first=null;
    }
    private boolean isEmpty(){
        return (first==null);
    }
    public void insert(long key){
        Link5 newLink=new Link5(key);
        Link5 current=first;
        Link5 previous=null;
        while (current!=null&&key>current.dData){
            previous=current;
            current=current.next;
        }
        if(previous==null){
            first=newLink;
        }else{
            previous.next=newLink;
        }
        newLink.next=current;
    }
    public Link5 remove(){
        Link5 temp=first;
        first=first.next;
        return temp;
    }
    public void displayList(){
        System.out.print("List ( first-->last): ");
        Link5 current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
