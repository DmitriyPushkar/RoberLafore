package Arrays.OrdArray;

public class OrderedApp {
    public static void main(String[] args) {
        OrderedArray arr=new OrderedArray(100);

        arr.insert(77);
        arr.insert(100);
        arr.insert(140);
        arr.insert(344);
        arr.insert(500);
        arr.insert(400);
        arr.insert(32);
        arr.insert(515);
        arr.insert(2);

        arr.display();

        int searchKey=515;
        if(arr.find(searchKey)!=arr.size())
            System.out.println("Found "+ searchKey);
        else
            System.out.println("Can't find "+searchKey );
        arr.display();

        arr.delete(344);
        arr.delete(32);

        arr.display();

    }
}
