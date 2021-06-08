// Rose Meyers
/* A short quiz that will ask the user fill in the blank, true/false, and multiple choice questions
 * on popular "Are You Smarter Than a Fifth Grader" subjects. A score will be kept for each question that
 * is answered correctly and displayed at end. */
package integrationProject2006;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
	String introGreeting = ("welcome to my Integration project for COP2006!");
	System.out.println("Hello, " + introGreeting);
	
    Scanner input1 = new Scanner (System.in);
    System.out.print("Please enter your name: ");
    final String username = input1.next();
// The keyword "final" is used with variables to create constants that cannot be changed.
    System.out.println();
    System.out.println(username +","+ " are you smarter than a fifth grader? Let's find out!");
    
    String subject = "All";
    switch (subject) {
    case "Math":
    	System.out.println("You'll be tested on math!");
    	break;
    case "English":
    	System.out.println("You'll be tested on english!");
    	break;
    case "All":
    	System.out.println("You'll be tested on on all subjects!");
    default: 
    	System.out.println("Enjoy the quiz!");
    }

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
	System.out.println("Question 2: What is the square root of 121?");
    Scanner answerTwo = new Scanner (System.in);
    System.out.print("Enter your answer: ");
    String answer2 = answerTwo.next();
   
    double answerToTwo = Math.sqrt(121);
    
	if (answer2.equals( "11" )) {
    	System.out.println("Correct!"); }
    	else 
    	System.out.println("That is incorrect. The correct answer is 11."); }
		
	System.out.println();
	System.out.println("Question 3: What is 9 - 4.5 ?");
		
	Scanner answerThree = new Scanner (System.in);
	
	System.out.print("Enter your answer: ");
	String answer3 = answerThree.next();
	double answertoThree = (5+4-4.5);
	
	if (answer3.equals(answertoThree)) {
	    System.out.println("Correct!"); }
	else 
	    System.out.println("That is incorrect. The correct answer is " + answertoThree ); 
	}; 
	
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
	{
	System.out.println();
	System.out.println("Question 4: Is " + (Math.floor(Math.random() * 10) + 1) + " a real number?");
		
	Scanner answerFour = new Scanner (System.in);
	
	System.out.print("Enter your answer: ");
	String answer4 = answerFour.next();

	Double answerToFour = (Math.floor(Math.random() * 10) + 15); {
	     
	
	if (answer4.equals("yes")) {
	    System.out.println("Correct!"); }
	else 
	    System.out.println("That is incorrect. It is actually true."); 

	
	
	System.out.println();
	System.out.println("Question 5: What is the remainder after dividing 17/5?");
    Scanner answerFive = new Scanner (System.in);
    System.out.print("Enter your answer: ");
    String answer5 = answerFive.next();
    
	if (answer5.equals( (17%5)  )) {
    	System.out.println("Correct!"); }
    	else 
    	System.out.println("That is incorrect. The correct answer is " + 17%5 ); }
	

	System.out.println();
	System.out.println("Question 6: What is the absolute value of -30 ?");
    Scanner answerSix = new Scanner (System.in);
    System.out.print("Enter your answer: ");
    String answer6 = answerSix.next();
  
	int b = -30;
	int absValue = b < 0 ? -b : b;
//RIPTutorial on Conditional Operator	

	if (answer6.equals( absValue )) {
    	System.out.println("Correct!"); }
   	else 
    	System.out.println("That is incorrect. The correct answer is " + absValue); }
/* Java has rules for operator precedence which affects how an expression is evaluated.
 * aka which operations will be completed first with priority. Multiplication 
 * and division have a higher precedence than addition and subtraction. *\	
	
/* == compares the value of two object references and checks for same location in memory.
.equals compares strings and checks if the values are the same. */
	
	System.out.println();
	System.out.println("Question 7: Which one of the continents has the highest population?");
    Scanner answerSeven = new Scanner (System.in);
    System.out.print("Enter your answer: ");
    
    String answer7 = answerSeven.next();
    
    while (true) {
    	if (answer7.equals("africa, europe, australia, north america, south america, antarctica")) {
    		System.out.println("That is a continent, but not the correct one. The correct answer is Asia");
    		break;
// The break statement ends the loop and moves on to next statement.
    	} else if (answer7.equals("asia")) {
    		System.out.println("That is correct!");
    		break;
    	} else {
    		System.out.println("That is not a continent. The correct answer is Asia.");
    		break;
    	} }
	System.out.println();
	System.out.println("Question 8: List the even, natural numbers from the following list:  ");
	for (int i = 0; i < 7; i++) {
		if (i == 4) {
			continue;
			}
		System.out.println(i);
	} 
// w3schools
	
/* Continue statement skips one iteration in a loop because of a specific condition,
 * then continues onto the next iteration. */
	System.out.println();
    System.out.print("Enter your answer: ");
    Scanner answerEight = new Scanner (System.in);
    String answer8 = answerEight.next();
    if (answer8.equals("2, 6")) {
	    System.out.println("Correct!"); }
	else 
	    System.out.println("That is incorrect. They are all natural numbers, except for 0, and only 2 and 6 are even values.");
    
	System.out.println();
	System.out.println("Question 9: Of the following, what is the most freuently used letter in the alphabet?");
    
    {
    char i = 'A';
    do {
    	System.out.println(i);
    	i++;
    } while (i <= 'F');
    }
    
    System.out.println();
    System.out.print("Enter your answer: ");
    Scanner answerNine = new Scanner (System.in);
    String answer9 = answerNine.next();
    if (answer9.equals("e")) {
	    System.out.println("Correct!"); }
	else 
	    System.out.println("That is incorrect. E is the most common letter in English text."); 

    
    		
    }
}
