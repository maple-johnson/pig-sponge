import java.util.ArrayList;
import java.util.List;

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

    /*
     * Need to solve spacing issue
     */
    // Implement your solution here!
    public static String pigLatin(String sentence) 
    {
          // Set inputs to lowercase     
          String lowerSentence = sentence.toLowerCase();

          // Set up variable for new pig latin sentence
          String newSentence = "";

          
          for (String item : lowerSentence.split(" ")) 
          {
               // If word starts with a vowel
               if (item.startsWith("a") || item.startsWith("e") || item.startsWith("i") || item.startsWith("o") || item.startsWith("u")) 
               {
                    // Add word to return variable as is
                    newSentence += item;
               }
               else
               {
                    // Set up the suffix by taking the first letter anc adding "ay"
                    String end = item.charAt(0) + "ay";

                    // Add the word without the first letter and the suffix
                    newSentence += item.substring(1) + end;

               }

          }

          // Return pig latin sentence
          return newSentence;          

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
  
  