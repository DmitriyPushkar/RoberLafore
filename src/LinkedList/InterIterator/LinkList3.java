package LinkedList.InterIterator;

public class LinkList3 {
    private Link8 first;
    public LinkList3(){
        first=null;
    }
    public Link8 getFirst(){
        return first;
    }
    public void setFirst(Link8 f){
        first=f;
    }
   public boolean isEmpty(){
        return first==null;
   }
   public ListIterator getIterator(){
        return new ListIterator(this);

   }
   public void displayList(){
        Link8 current=first;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
       System.out.println();
   }
}
