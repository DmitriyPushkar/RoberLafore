package Recursion;

public class TriangleApp {
    static int theNumber;

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        theNumber=2;
        int theAnswer=triangle(theNumber);
        System.out.println("Triangle="+theAnswer);
    }
    public static int triangle(int n){
        if(n==1){
            return 1;
        }
        return (n+triangle(n-1));
    }

}
