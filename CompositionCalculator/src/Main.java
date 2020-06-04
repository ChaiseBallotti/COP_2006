import java.util.Scanner;
import java.util.Random;

/* Author: Chaise Ballotti
 * This project will focus on understanding the value of a given comps in team Fight Tactics, and
 * should help improve decision making and winning games.
 * 
 */

/*
 * required comments
 * 
 * Java built in or primitive data types. Byte - (8 bits, integer) the smallest type min value of
 * -128 , max 127. the byte is useful when saving memory in large arrays. Short - (16 bits, integer)
 * min value of -32,768, max 32,767. shorts are also used when saving memory is needed. Int - (32
 * bits, integer) min -2^31, max 2^31 - 1. int is used for unsigned integers. Long - (64 bits,
 * integer) min -2^63, max 2 ^64 - 1. long is a special case and I will probably know when this is
 * needed. Float - (32 bits, floating point) it is referred to as a single precision type floating
 * point. Double - (64 bits, floating point) known as being a double precision type floating point.
 * Boolean - true or false, used to flag conditions Char - (16 bit, Unicode) min '\u0000', max
 * '\uffff'
 * 
 * Scope is what part of the program is able to know and use a variable or not. local variables are
 * only accessed in the level or block of code it was written in. global variables are defined
 * outside of a function, and are regarded as bad practice to use.
 * 
 * A variable in programming is name that has an associated location in memory with a value stored
 * within that location.
 * 
 * the call method is used to invoke a method in a different class. Depending on the declared
 * method's order, amount, and type of parameters, the arguments of the call method must
 * respectively match.
 * 
 * Casting is setting a variable with a data type and a value, then reassigning the data type of the
 * variable later on. this can be applied to a smaller data type going to a larger data type
 * (widening). Widening can be done easily. The other type of casting is narrowing (going from a 
 * larger data type to a smaller type. More thought needs to be put into this, you want to avoid
 * over flowing the type. another thing to consider is loss of information going from a floating 
 * point to a integer.
 * 
 * Operators with higher precedence than a precedence lower than it will always be evaluated first.
 * Operators on the same line will have equal precedence, this is resolved in code as left to right
 * order unless it is an assignment operator. 
 * 
 */

public class Main {

  public static void main(String[] args) {

    // finals are initialized once and never changed by the code.
    
    
    Scanner scan = new Scanner(System.in); // initialize new Scanner object
    
    Random randomNum = new Random(); // initialize new random object
    int unitsToAssess = randomNum.nextInt(90); // this will limit the number
    boolean loop = true;

    do {
      unitsToAssess += 10; // this will make the number of units at least 10
      unitsToAssess -= 5; // drops the number of units to at least 5
      --unitsToAssess; // units will drop to at least 4
      ++unitsToAssess; // units will increase to at least 5
      unitsToAssess = unitsToAssess % 10; // will end up returning a value between 0 and 9
      loop = unitsToAssess != 0 ? false : true; // if true loop will run again until a true
                                                // statement
      // System.out.println(unitsToAssess);
    } while (loop);
    // we will use the random to assess a random amount of units

    // Great the use when code starts.
    // this will be used for patch checking in the future
    System.out.println("Welcome to the TFT comp calculator. We will be focusing"
        + "on calculating champion dps first." + System.lineSeparator() + "The"
        + " current patch is:" + " 10.11" + System.lineSeparator() + "Is"
        + " this corrtect? [yes/no]");


    Boolean patch = true; // initialize the boolean expression

    // Checking for current patch
    while (patch) {
      String answer = scan.nextLine();
      if (answer.equalsIgnoreCase("yes")) {
        for (int i = 0; i <= unitsToAssess; i++) {
          if (i == 0) {
            // this will omit the first iteration of the for loop, not necessary just
            // needed for project.
            continue;
          }
          //automated actions in the future
          System.out.println("Which unit would you like to assess?");
          String name = scan.nextLine();
          Unit newUnit = new Unit(name);
          
          double damage = (double)(randomNum.nextInt(200) + 50);
          newUnit.setDamage(damage);
          newUnit.getDamage();
          
          double attackSpeed = randomNum.nextDouble() + .25;
          newUnit.setAttackSpeed(attackSpeed);
          newUnit.getAttackSpeed();

          newUnit.getDPS();
        }
        break; // this will break out of the loop after unit assessment has been ran
      } else if (answer.equalsIgnoreCase("no")) {
        System.out.println("Please update the patch file and try again");
        patch = false; // this path should stop the program but I don't know how yet.
      } else {
        System.out.println("That is not a valid input, please try again");
      }
    }
    
    //scan.nextLine();
    System.out.println("Who is your favorite Champion?");
    String favChamp = scan.nextLine().toLowerCase();
    int compareChamp = favChamp.compareTo("jhin");
    switch (compareChamp) {
      case 0:
        System.out.println("Wow that is my favorite Champion too!");
        break;
      default:
        System.out.println("That is a pretty good Champion. My favorite is Jhin");
    }

    System.out.println("Before you leave, what is your favorite number?");

    double favoriteNumber = scan.nextDouble();


    System.out.println("That is great! However, your new favorite number is: " 
        + (Math.sqrt(Math.abs(favoriteNumber)) + Math.PI) + System.lineSeparator() 
        + "Hope you remember that!");

  }
}
