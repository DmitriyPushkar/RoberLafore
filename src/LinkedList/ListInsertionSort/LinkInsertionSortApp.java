package LinkedList.ListInsertionSort;

public class LinkInsertionSortApp {
    public static void main(String[] args) {

      int size=10;
    Link6[] linkArray=new Link6[size];
    for(int i=0; i<size; i++){
        int n=(int)(java.lang.Math.random()*99);
        Link6 newLink=new Link6(n);
        linkArray[i]=newLink;
    }
        System.out.println("Unsorted array: ");
    for(int i=0; i<size; i++){
        System.out.print(linkArray[i].dData+ " ");
    }
        System.out.println(" ");
    SortedList theSortedList=new SortedList(linkArray);
    for(int j=0; j<size; j++){
        linkArray[j]=theSortedList.remove();

    }
        System.out.println("Sorted Array:");
    for(int i=0; i<size; i++){
        System.out.print(linkArray[i].dData+" ");
    }
        System.out.println(" ");

    }}
