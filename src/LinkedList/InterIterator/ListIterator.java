package LinkedList.InterIterator;

public class ListIterator {
    private Link8 current;
    private Link8 previous;
    private LinkList3 ourList;
    public ListIterator(LinkList3 list){
        ourList=list;
        reset();
    }
    public void reset(){
        current=ourList.getFirst();
        previous=null;
    }
    public boolean atEnd(){
        return (current.next==null);
    }
    public void nextLink(){
        previous=current;
        current=current.next;
    }
    public void insertAfter(long dd){
        Link8 newLink=new Link8(dd);
        if(previous==null){
            newLink.next=ourList.getFirst();
            ourList.setFirst(newLink);
            reset();
        }else{
            newLink.next=previous.next;
            previous.next=newLink;
            current=newLink;
        }
    }
    public long deleteCurrent(){
        long value= current.dData;
        if(previous==null){
            ourList.setFirst(current.next);
            reset();
        }else{
            previous.next=current.next;
            if(atEnd()){
                reset();
            }else{
                current=current.next;
            }
        }
        return value;

    }
}
