package elizaApplication;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);

        Eliza elisaObj = new Eliza();

        String userInput ="";

        System.out.println(elisaObj.getInitialMessage() + elisaObj.getRepitedQuestions());

//
//        userInput =  scan.nextLine();
//        System.out.println(userInput);



        while (!userInput.equalsIgnoreCase("Q")){

            System.out.println(elisaObj.getRepitedQuestions());
            userInput =  scan.nextLine();

            System.out.println(userInput.replaceAll("my", "your").replaceAll(("am"),"are").replaceAll("me", "you").replaceAll("I", "you"));

            if (userInput.equalsIgnoreCase("q")){
                System.exit(0);

            }

        }
    }

}
