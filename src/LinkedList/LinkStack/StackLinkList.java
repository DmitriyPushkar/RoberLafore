package LinkedList.LinkStack;

public class StackLinkList {
    private Link4 first;
    public StackLinkList(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void insertFirst(long dd){
        Link4 newLink=new Link4(dd);
        newLink.next=first;
        first=newLink;}
    public long deleteFirst(){
        Link4 temp=first;
        first=first.next;
        return temp.dData;
    }
    public void displayList(){
        Link4 current=first;
        while(current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
