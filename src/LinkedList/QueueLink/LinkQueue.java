package LinkedList.QueueLink;

public class LinkQueue {
    private FirstLastList2 theList;
    public LinkQueue(){
        theList=new FirstLastList2();
    }
    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void insert(long i){
        theList.insertLast(i);
    }
    public long remove(){
        return  theList.deleteFirst();
    }
    public void displayQueue(){
        System.out.println("Queue (front-->rear): ");
        theList.displayList();
    }

}
