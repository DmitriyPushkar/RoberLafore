package Stack.brackets;

import java.io.IOException;
import java.util.Scanner;

public class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;
        while(true){
            System.out.println("Enter string containing delimeters: ");
            System.out.flush();
            input="{dmitriy(pushkar[ev]daw)dwef}";
            if(input.equals(" ")){
                break;
            }
            BracketChecker theChecker=new BracketChecker(input);
            theChecker.check();
        }
    }
}
