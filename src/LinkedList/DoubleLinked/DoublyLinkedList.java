package LinkedList.DoubleLinked;

public class DoublyLinkedList {
    private Link7 first;
    private Link7 last;
    public DoublyLinkedList(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(long dd){
        Link7 newLink=new Link7(dd);
        if(isEmpty()){
            last=newLink;
        }else{
            first.previous=newLink;
        }
        newLink.next=first;
        first=newLink;
    }
    public void insertLast(long dd){
       Link7 newLink=new Link7(dd);
       if(isEmpty()){
           first=newLink;
       }else{
           last.next=newLink;
       }
       newLink.previous=last;
       last=newLink;
    }
    public Link7 deleteFirst(){
        Link7 temp=first;
        if(first.next==null){
            last=null;
        }else{
            first.next.previous=null;
        }
        first=first.next;
        return temp;
    }

    public Link7 deleteLast(){
        Link7 temp=last;
        if(first.next==null){
            first=null;
        }else{
            last.previous.next=null;
        }
        last=last.previous;
        return temp;
    }
    public boolean insertAfter(long key, long dd){
    Link7 current=first;
    while (current.dData!=key){
        if(current.next==null){
            return false;
        }
        current=current.next;
    }
    Link7 newLink=new Link7(dd);
    if(current==last) {
        newLink.next=null;
      last=newLink;
    }else{
        newLink.next=current.next;
        current.next.previous=newLink;
    }
    newLink.previous=current;
    current.next=newLink;
    return true;
    }

    public Link7 deleteKey(long key) {
        Link7 current=first;
        while (current.dData!=key){
            current=current.next;
            if(current==null){
                return null;
            }
        }
        if(current==first){
            first= current.next;
        }else{
            current.previous.next=current.next;
        }
        if(current==last){
            last=current.previous;
        }else{
            current.next.previous=current.previous;
        }
        return current;
    }
    public void displayForward(){
        System.out.println("List (first-->last): ");
        Link7 current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println();
    }
    public void displayBackward(){
        System.out.println("List (last-->first); ");
        Link7 current=last;
        while (current!=null){
            current.displayLink();
            current=current.previous;
        }
        System.out.println();
    }
}
