// Rose Meyers
/* A short quiz that will ask the user fill in the blank, true/false, and multiple choice questions
 * on popular "Are You Smarter Than a Fifth Grader" subjects. A score will be kept for each question that
 * is answered correctly and displayed at end. */
package integrationProject2006;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
	String introGreeting = ("welcome to my Integration project for COP2006!");
	System.out.println("Hello, " + introGreeting);

    Scanner input1 = new Scanner (System.in);
    System.out.print("Please enter your name: ");
    final String userName = input1.next();
 // The keyword "final" is used with variables to create constants that cannot be changed.
    System.out.println();
    System.out.println(userName +","+ " are you smarter than a fifth grader? Let's find out!");
    
	

// A variable is a location to store data that can later be referenced in your program. 
// Scope is the area of a program where a specific function or variable can be successfully referred to.
    System.out.println();
    
    Boolean x = true;
    Boolean y = false;
    System.out.println("Question 1: Is the following a " + x + " statement? Or is it a " + y + " statement?");
	System.out.println("Australia is both an island and a continent. ");
    System.out.println();
    
    Scanner answerOne = new Scanner (System.in);
    System.out.print("Enter your answer: ");
    String answer = answerOne.next();
    
    if (answer.equals("true")) {
    	System.out.println("Correct!"); }
    else 
    	System.out.println("That is incorrect. It is actually true."); 
	{
		{
	System.out.println();
	System.out.println("Question 2: What is 80+30?");
	
    Scanner answerTwo = new Scanner (System.in);
    System.out.print("Enter your answer: ");
    String answer2 = answerTwo.next();
   
    int answerToTwo = 100;
    
	if (answer2.equals( answerToTwo + 10)) {
    	System.out.println("Correct!"); }
    else 
    	System.out.println("That is incorrect. The correct answer is 110."); }
		
	System.out.println();
	System.out.println("Question 3: What is 9 - 4.5?");
		
	Scanner answerThree = new Scanner (System.in);
	
	System.out.print("Enter your answer: ");
	String answer3 = answerThree.next();

	Double answerToThree = 6.5;
	     
	if (answerThree.equals( answerToThree )) {
	    System.out.println("Correct!"); }
	else 
	    System.out.println("That is incorrect. The correct answer is " + ( answerToThree )); }
/* Java built-in data types:
 * Byte  = A group of binary digits or bits, usually eight, operated on as a unit. This data type can be useful for saving memory in large arrays.
Short = A data type that stores whole numbers, 16-bit. 
Int = A data type that stores whole numbers that can be positive or negative, 32-bit.
Long = A data type that can store whole numbers and holds the largest integer values, 64-bit.
Boolean =  A data type that stores data that can be either true or false.
Char = A data type that stores a single letter, uses single quotes. 
Float = A data type that stores fractional numbers.
Double = A data type that stores fractional numbers, has a greater range than float type. 
 */
	}
}