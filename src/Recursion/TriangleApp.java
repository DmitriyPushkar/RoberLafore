package Recursion;

public class TriangleApp {
    static int theNumber;

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        theNumber=5;
        int theAnswer=triangle(theNumber);
        System.out.println();

        System.out.println("Triangle="+theAnswer);

    }
    public static int triangle(int n) {
        System.out.println("Entering: n=" + n);
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        }
        int temp = (n + triangle(n - 1));
        System.out.println("Returning " + temp);
        return temp;
    }

}
