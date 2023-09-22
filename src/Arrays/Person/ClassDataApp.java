package Arrays.Person;

public class ClassDataApp {

    public static void main(String[] args) {
        ClassDataArray arr=new ClassDataArray(100);
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
        arr.display();
        String searchKey="Abert";
        Person found=arr.find(searchKey);
        if(found!=null){
            System.out.println("Found ");
            found.displayPerson();
        }else{
            System.out.println("Can't find "+searchKey );
        }
        arr.delete("Abert");
        arr.display();

    }
}
