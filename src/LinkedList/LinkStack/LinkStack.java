package LinkedList.LinkStack;

public class LinkStack {
    private StackLinkList theList;
    public LinkStack(){
        theList=new StackLinkList();
    }
    public void push(long i){
        theList.insertFirst(i);
    }
    public long pop(){
        return theList.deleteFirst();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void displayStack(){
        System.out.println("Stack (top-->bottom): ");
        theList.displayList();
    }
}
