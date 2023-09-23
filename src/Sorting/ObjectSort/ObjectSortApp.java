package Sorting.ObjectSort;

public class ObjectSortApp {
    public static void main(String[] args) {
        int maxSize=100;
        ArrayInOb arr=new ArrayInOb(maxSize);
        arr.insert("Dima", "Pushkar", 21);
        arr.insert("Lena", "Shirok", 32);
        arr.insert("Vasya", "Abert", 15);
        arr.insert("roman", "Kuring", 23);
        arr.insert("Kirill", "Sistem", 75);
        arr.insert("Egor", "Sharkow", 42);
        arr.insert("Alice", "Shadow", 15);
        arr.insert("Genry", "Lusing", 56);
        arr.insert("Jim", "Racford", 34);
        arr.insert("Winston", "Garibaldi", 66);
        arr.insert("Rudolf", "Siziy", 54);

        System.out.println("Before sorting : ");
        arr.display();
        System.out.println("After sorting : ");
        arr.insertionSort();
        arr.display();
    }
}
