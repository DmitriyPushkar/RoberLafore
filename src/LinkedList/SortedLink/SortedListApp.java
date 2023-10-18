package LinkedList.SortedLink;

public class SortedListApp {
    public static void main(String[] args) {
        SortedList thSortedList=new SortedList();
        thSortedList.insert(20);
        thSortedList.insert(40);

        thSortedList.displayList();

        thSortedList.insert(10);
        thSortedList.insert(30);
        thSortedList.insert(50);

        thSortedList.displayList();

        thSortedList.remove();
        thSortedList.displayList();
    }
}
