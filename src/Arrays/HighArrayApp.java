package Arrays;

public class HighArrayApp {

    public static void main(String[] args) {
        HighArray arr=new HighArray(100);
        arr.insert(11);
        arr.insert(22);
        arr.insert(33);
        arr.insert(44);
        arr.insert(55);
        arr.insert(66);
        arr.insert(77);
        arr.insert(88);
        arr.insert(99);
        arr.insert(100);

        arr.display();

        int searchKey=55;
        if(arr.find(searchKey)){
            System.out.println("Found "+ searchKey);
        }else{
            System.out.println("Can't find "+searchKey);
        }

        arr.delete(22);
        arr.delete(33);
        arr.delete(44);

        arr.display();

    }
}
