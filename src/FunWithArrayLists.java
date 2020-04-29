/**
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *       PSEUDOCODE    * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 *
 *
 *
 *
 * * * * * * * * * * * * * * * * * *       TEST DATA - 1    * * * * * * * * * * * * * * * * *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class FunWithArrayLists {
    public static void main(String[] args) {

        // 1. a Java new array list to hold colors.
        ArrayList<String> colors = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        boolean cont = true;

        // 2. Add atleast three colors and printout all its value.
        colors.add("RED");
        colors.add("YELLOW");
        colors.add("GREEN");
        colors.add("BLUE");

        // print all that are in the arraylist
        System.out.println(colors);

        // 3. print the value at index 1.
        System.out.println("The color at index 1 is: " + colors.get(1));
        System.out.println();

        // 4. prompt user to add one color
        System.out.print("Enter a new color: ");
        // add what the user entered
        String input = keyboard.nextLine();
        colors.add(input);

        // 5. continue prompting the user to enter colors until user type q/Q
        while (cont == true) {

            System.out.print("\nEnter a new color: ");
            // scan and add the input to ArrayList
            input = keyboard.nextLine();
            colors.add(input);

            System.out.println(input + " color entered.");
            // get ArrayList size
            int n = colors.size();
            // prompt user to continue or quit
            System.out.print("\nPress any key to continue \nor Enter (q/Q) to quit. ");
            // scan user's reply
            input = keyboard.nextLine();

            // if user hit q or Q -> quit!
            if (input.equalsIgnoreCase("q")) {
                // while loop control has to be false to get out of while loop
                cont = false;
                // print set of colors added sofar
                System.out.println("\nList of colors are: " + colors);
                // get out of the loop and finish the program
                return;
            }
        }   // end of while loop
        keyboard.close();
    }    // end of main() method
}   // end of class