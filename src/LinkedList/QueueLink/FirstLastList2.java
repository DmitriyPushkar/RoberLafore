package LinkedList.QueueLink;

public class FirstLastList2 {
    private Link4 first;
    private Link4 last;
    public FirstLastList2(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void insertLast(long dd){
        Link4 newLink= new Link4(dd);
        if(isEmpty()){
          first=newLink;
        }else{
            last.next=newLink;
        }
        last=newLink;
    }
    public long deleteFirst(){
        long temp= first.dData;
        if(first.next==null){
            last=null;
        }else{
            first=first.next;
        }
        return temp;
    }
    public void displayList(){
        Link4 current =first;
        while (current!=null){
            current.displayLink();;
            current=current.next;
        }
        System.out.println("");
    }
}
