
import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
        // Initializing scanner
        Scanner userInput = new Scanner(System.in);
        // Adding the madlibs
        String madlib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        // madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        // madlib = "Many years ago there was a <adjective> <noun>, that liked to
        // <verb>."

        // Finding the words to be replaced and getting user input for it and storing
        // the input
        int beginFirstWord = madlib.indexOf("<") + 1;
        int endFirstWord = madlib.indexOf(">");
        String firstWord = madlib.substring(beginFirstWord, endFirstWord);
        System.out.println("Pick a " + firstWord);
        String inputOne = userInput.nextLine();

        int beginSecondWord = madlib.indexOf("<", endFirstWord) + 1;
        int endSecondWord = madlib.indexOf(">", endFirstWord + 1);
        String secondWord = madlib.substring(beginSecondWord, endSecondWord);
        System.out.println("Pick a " + secondWord);
        String inputTwo = userInput.nextLine();

        int beginThirdWord = madlib.indexOf("<", endSecondWord) + 1;
        int endThirdWord = madlib.indexOf(">", endSecondWord + 1);
        String thirdWord = madlib.substring(beginThirdWord, endThirdWord);
        System.out.println("Pick a " + thirdWord);
        String inputThree = userInput.nextLine();

    }

}