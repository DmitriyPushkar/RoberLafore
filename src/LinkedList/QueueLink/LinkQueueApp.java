package LinkedList.QueueLink;


public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue theStack =new LinkQueue();
        theStack.insert(20);
        theStack.insert(40);
        theStack.displayQueue();
        theStack.insert(60);
        theStack.insert(80);
        theStack.displayQueue();
        theStack.remove();
        theStack.remove();
        theStack.displayQueue();
    }
}
