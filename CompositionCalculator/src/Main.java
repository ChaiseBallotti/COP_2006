import java.util.Scanner;

/*
 * This project will focus on understanding the value of a given comps in team
 * Fight Tactics, and should help improve decision making and winning games.
 * 
 * Author: Chaise Ballotti
 */

/*
 * required comments
 * 
 * Java built in or primitive data types.
 *  Byte - (8 bits, integer) the smallest type min value of -128 , max 127. the 
 *  byte is useful when saving memory in large arrays. 
 *  Short - (16 bits, integer) min value of -32,768, max 32,767. shorts are also
 *   used when saving memory is needed.
 *   Int - (32 bits, integer) min -2^31, max 2^31 - 1. int is used for unsigned
 *   integers.
 *   Long - (64 bits, integer) min -2^63, max 2 ^64 - 1. long is a special case 
 *   and I will probably know when this is needed.
 *   Float - (32 bits, floating point) it is referred to as a single precision 
 *   type floating point.
 *   Double - (64 bits, floating point) known as being a double precision type 
 *   floating point.
 *   Boolean - true or false, used to flag conditions
 *   Char - (16 bit, Unicode) min '\u0000', max '\uffff'
 */

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // initialize new Scanner object
    
    // Great the use when code starts.
    // this will be used for patch checking in the future
    System.out.println("Welcome to the TFT comp calculator. We will be focusing"
        + "on calculating champion dps first." + System.lineSeparator() + "The"
            + " current patch is:" + " 10.10" + System.lineSeparator() + "Is"
                + " this corrtect? [yes/no]");
    
    Boolean patch = false; //initialize the boolean expression
    
    
    // Checking for current patch
    while (true) {
      String answer = scan.nextLine();
      if (answer.equals("yes")) {
        patch = true;
        break;
      }
      else if (answer.equals("no")) {
        System.out.println("Please update the patch file and try again");
        break;
      }
      else {
        System.out.println("That is not a valid input, please try again");
      }
    }
    
    System.out.println("Input a units Atack speed persecond");// this will be automated later
    double attackSpeed = scan.nextInt();
    
    // Prompt user for a input file of the current patch when file io is learned
  }
}
