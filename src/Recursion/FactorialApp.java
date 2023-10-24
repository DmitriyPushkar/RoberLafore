package Recursion;

public class FactorialApp {
    public static void main(String[] args) {
        System.out.println( findFactorial(9));
    }
    public static int findFactorial(int i){
        if(i==0){
            return 1;
        }else{
        return i*findFactorial(i-1);
    }}
}
