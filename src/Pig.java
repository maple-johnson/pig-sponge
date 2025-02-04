import java.util.ArrayList;

public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) 
    {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) 
    {
          //Set inputs to lowercase     
          String lowerSentence = sentence.toLowerCase();

          //ArrayList<String> words = new ArrayList<String>();
          //String[] words = lowerSentence.split(" ");
          //words.addAll(lowerSentence.split(" "));

          /*
           * Attempting to separate multiple words into an array.
           * Each item can then be fed through a while loop to convert each word into pig latin
           */

          // while ()) {
               
          // }
          
          // If word starts with a vowel
          if (lowerSentence.startsWith("a") || lowerSentence.startsWith("e") || lowerSentence.startsWith("i") || lowerSentence.startsWith("o") || lowerSentence.startsWith("u")) 
          {
               // Return word as was
               return lowerSentence;
          }
          else
          {
               // Set up the suffix by taking the first letter anc adding "ay"
               String end = lowerSentence.charAt(0) + "ay";

               // Add the word without the first letter and the suffix
               String newSentence = lowerSentence.substring(1) + end;

               // Return new word
               return newSentence;
          }

    }


    /*
     * take string
     * lowercase
     * return as pig latin
     * ---if starts with vowel, no change
     */






    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  