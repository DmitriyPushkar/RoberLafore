package Sorting.SelectSort;


public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize=100;
        ArraySel arr=new ArraySel(maxSize);

        arr.insert(12);
        arr.insert(44);
        arr.insert(55);
        arr.insert(66);
        arr.insert(77);
        arr.insert(55);
        arr.insert(33);
        arr.insert(22);
        arr.insert(11);
        arr.insert(10);

        arr.display();

        arr.selectSort();

        arr.display();

    }
}
