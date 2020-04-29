# Fun with ArrayList

### Five Exercises are compiled here with:
1. Write a Java program to create a new array list to hold colors.
2. Add at least 3 colors (string) to the array list and print out all its values.
3. Using the array list created above, print out the value at index 1.
4. Using the array list above, prompt the user for one new color, and add that 
color to the array list.
5. Using the array list, continue prompting the user for colors until they type 
in "Q" or "q" to quit. Each time the user enters a color, add that to the array list. 
Print out the list at the end.

### MOVIES
 The application prompts the user to enter the name of their favorite Movie. 
 Adds the Movie to an array list.  Uses a loop to continue adding movies to 
 the array until the user presses (q or Q). 
 
 Once the user presses Q then print the list of movies before exiting the program.
 
 uses the .toLowerCase() method of the String class to convert the 'Q' to 'q'. 
 So if user's response is stored in a variable called userAnswer then 
 userAnswer.toLowerCase() will evaluate to a 'q'. Alternatively, 
 player can use the userAnswer.equalsIgnoreCase("q") method.
 
Prints out the list of movies sorted in alphabetical order.
 
 Suggests one best movie to the user to watch by randomly selecting a movie 
 from the list of movies entered.
