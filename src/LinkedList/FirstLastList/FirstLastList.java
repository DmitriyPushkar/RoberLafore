package LinkedList.FirstLastList;



public class FirstLastList {
    private Link3 first;
    private Link3 last;
    public FirstLastList(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void  insertFirst(long dd){
     Link3 newLink=new Link3(dd);
     if(isEmpty()){
         last=newLink;
     }
     newLink.next=first;
     first=newLink;
    }
    public void insertLast(long dd) {
        Link3 newLink=new Link3(dd);
    if(isEmpty()){
        first=newLink;
    }else{
     last.next=newLink;
     last=newLink;
    }
    }
    public long deleteFirst(){
        long temp = first.dData;
        if(first.next==null){
            last=null;
        }
        first=first.next;
        return temp;

    }
    public void displayList(){
        System.out.println("List (first-->last): ");
        Link3 current=first;
        while(current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
