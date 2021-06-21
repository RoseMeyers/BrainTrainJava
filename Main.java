// Rose Meyers
/* A short quiz that will ask the user fill in the blank, true/false, and multiple choice questions
 * on popular "Are You Smarter Than a Fifth Grader" subjects. A score will be kept for each question that
 * is answered correctly and displayed at end. */
package integrationProject2006;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Main {

	public static void promptAnswer() {
		System.out.println("Enter your answer: ");
	}

	public static void main(String[] args) {
		String introGreeting = ("welcome to my Integration project for COP2006!");
		System.out.println("Hello, " + introGreeting);

		Scanner input = new Scanner(System.in);
		name nameObject = new name();

		System.out.print("Please enter your name: ");
		String userName = input.nextLine();
		nameObject.greetUser(userName);

// The keyword "final" is used with variables to create constants that cannot be changed.

		System.out.println("\n" + userName + "," + " are you smarter than a fifth grader? Let's find out!");

		String subject = "All";
		switch (subject) {
		case "Math":
			System.out.println("You'll be tested on math!");
			break;
		case "English":
			System.out.println("You'll be tested on english!");
			break;
		case "All":
			System.out.println("You'll be tested on on all subjects.");
		default:
			System.out.println("Enjoy the quiz!");
		}

// A variable is a location to store data that can later be referenced in your program. 
// Scope is the area of a program where a specific function or variable can be successfully referred to.

		{
			Boolean x = true;
			Boolean y = false;
			System.out.println(
					"\n" + "Question 1: Is the following a " + x + " statement? Or is it a " + y + " statement?");
			System.out.println("Australia is both an island and a continent. ");
			System.out.println();

			Scanner answerOne = new Scanner(System.in);
			promptAnswer();
			String answer = answerOne.next();

			if (answer.equals("true")) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. It is actually true.");
		}
		{
			System.out.println("\n" + "Question 2: What is the square root of 121?");
			promptAnswer();

			Scanner scan = new Scanner(System.in);

// Module 11 Exceptions lecture
			boolean inputIsBad = true;
			Double answer2 = (double) 0;
			/*
			 * Casting is when the user assigns a value of one primitive data type to
			 * another type. The two types of casting are narrowing: Assigning a value of
			 * larger data type to a smaller data type. And there is widening: Assigning a
			 * value of of a smaller data type to a bigger data type, or occurs
			 * automatically when the two data types are compatible.
			 */
			do {
				try {
					answer2 = scan.nextDouble();
					inputIsBad = false;
				} catch (InputMismatchException e) {
					System.out.println("Input was not an integer. Try again.");
					scan.nextLine();
				}
			} while (inputIsBad);

			if (answer2.equals(11)) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. The correct answer is 11.");
		}

		{
			String x = "th";
			/*
			 * compareTo returns 0 if strings are equal, returns -1 if first string is
			 * longer, aka has more characters, and returns 1 if second string is longer.
			 */

			System.out.println("\n" + "Question 3: What is 9 - 3.5" + " - " + (x.compareTo("the")) + "?");
			Scanner answerThree = new Scanner(System.in);
			System.out.print("Enter your answer: ");
			String answer3 = answerThree.next();
			double answertoThree = (5 + 4 - 4.5);
			if (answer3.equals("4.5")) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. The correct answer is " + answertoThree);
		}
		;

		/*
		 * Java built-in data types: Byte  = A group of binary digits or bits, usually
		 * eight, operated on as a unit. This data type can be useful for saving memory
		 * in large arrays. Short = A data type that stores whole numbers, 16-bit. Int =
		 * A data type that stores whole numbers that can be positive or negative,
		 * 32-bit. Long = A data type that can store whole numbers and holds the largest
		 * integer values, 64-bit. Boolean =  A data type that stores data that can be
		 * either true or false. Char = A data type that stores a single letter, uses
		 * single quotes. Float = A data type that stores fractional numbers. Double = A
		 * data type that stores fractional numbers, has a greater range than float
		 * type.
		 */
		{

			System.out.println("\n" + "Question 4: Is " + (Math.floor(Math.random() * 10) + 1) + " a real number?");
			Scanner answerFour = new Scanner(System.in);
			System.out.print("Enter your answer: ");
			String answer4 = answerFour.next();
			Double answerToFour = (Math.floor(Math.random() * 10) + 15);
			{

				if (answer4.equals("yes")) {
					System.out.println("Correct!");
				} else
					System.out.println("That is incorrect. It is actually true.");

				System.out.println("\n" + "Question 5: What is the remainder after dividing 17/5?");
				Scanner answerFive = new Scanner(System.in);
				promptAnswer();
				String answer5 = answerFive.next();

				if (answer5.equals((17 % 5))) {
					System.out.println("Correct!");
				} else
					System.out.println("That is incorrect. The correct answer is " + 17 % 5);
			}

			System.out.println("\n" + "Question 6: What is the absolute value of -30 ?");
			Scanner answerSix = new Scanner(System.in);
			promptAnswer();
			String answer6 = answerSix.next();

			int b = -30;
			int absValue = b < 0 ? -b : b;
//RIPTutorial on Conditional Operator	

			if (answer6.equals(b)) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. The correct answer is " + absValue);
		}
		/*
		 * Java has rules for operator precedence which affects how an expression is
		 * evaluated. aka which operations will be completed first with priority.
		 * Multiplication and division have a higher precedence than addition and
		 * subtraction. *\
		 * 
		 * /* == compares the value of two object references and checks for same
		 * location in memory. .equals compares strings and checks if the values are the
		 * same.
		 */
		{
			System.out.println("\n" + "Question 7: Which continent has the highest population?");
			Scanner answerSeven = new Scanner(System.in);
			promptAnswer();
			String answer7 = answerSeven.next();

			while (true) {
				if (answer7.equals("africa, europe, australia, north america, " + "south america, antarctica")) {
					System.out.println("That is a continent, but not the correct " + "one. The correct answer is Asia");
					break;
// break statement ends the loop and moves on to next statement.
				} else if (answer7.equals("asia")) {
					System.out.println("That is correct!");
					break;
				} else if (answer7.equals("Asia")) {
					System.out.println("That is correct!");
					break;
				} else {
					System.out.println("That is not a continent. " + "The correct answer is Asia.");
					break;
				}
			}
			System.out.println("\n" + "Question 8: List the even, natural numbers from " + "the following list:  ");
			for (int i = 0; i < 7; i++) {
				if (i == 4) {
					continue;
				}
				System.out.println(i);
			}
// w3schools

			/*
			 * Continue statement skips one iteration in a loop because of a specific
			 * condition, then continues onto the next iteration.
			 */

			System.out.print("\n");
			promptAnswer();
			Scanner answerEight = new Scanner(System.in);
			String answer8 = answerEight.next();
			if (answer8.equals("2, 6")) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. Except for 0, they are all natural numbers, "
						+ "and only 2 and 6 are even values.");

			System.out.println(
					"\n" + "Question 9: Of the following, what is the most frequently used letter in the alphabet?");

			{
				char i = 'A';
				do {
					System.out.println(i);
					i++;
				} while (i <= 'F');
			}

			System.out.print("\n");
			promptAnswer();
			Scanner answerNine = new Scanner(System.in);
			String answer9 = answerNine.next();
			if (answer9.equals("e")) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. E is the most common letter in English text.");

			System.out.println("Final question!");
			System.out.println("\n" + "Question 10: What is the hottest planet in our solar system?");
			Scanner answerTen = new Scanner(System.in);
			System.out.print("Enter your answer: ");
			String answer10 = answerTen.next();
// Capitalize answer
			if (answer10.equals((Arrays.planets[2]))) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. The correct answer is " + Arrays.planets[2]);
		}
			{ Random rand = new Random();
			// instance of random class, prints a random number from range 1-10
			int upperbound = 10;
			int int_random = rand.nextInt(upperbound);

			System.out.println(int_random);

			System.out.println("\n" + "Question 11: What is the largest numbers in this list?");

			int[][] grid = { { 3, 5, 0, int_random, 1 },
					{ 9, 11 }, 
					{ 1, 15, 3, 4 }, 
					{ 8 } };
			System.out.println(grid[0][3]);
			System.out.println(grid[1][1]);
			System.out.println(grid[0][4]);
			System.out.println(grid[2][1]);
			System.out.println(grid[2][3]);
			System.out.println(grid[3][0]);

			Scanner answerTwelve = new Scanner(System.in);
			promptAnswer();
			String answer12 = answerTwelve.next();

			if (answer12.equals(grid[2][1])) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. The correct answer is " + (grid[2][1])); }

			{ System.out.println("\n" + "Question 13: What is the total of the following list?" + " \n (10, 5, 2, 3).");

			int arrayThirteen[] = { 10, 5, 2, 3 };
			int sum = 0;
			for (int counter = 0; counter < arrayThirteen.length; counter++) {
				sum += arrayThirteen[counter];
			}
			Scanner answerThirteen = new Scanner(System.in);
			promptAnswer();
			String answer13 = answerThirteen.next();
			{
				if (answer13.equals(sum)) {
					System.out.println("Correct!");
				} else
					System.out.println("That is incorrect. The correct answer is " + sum); }
			}
		{
			// In class example and w3
			int[] smallestNumber = { 14, 12, 8, 15, 10 };
			int index = 0;
			int min = smallestNumber[0];
			for (int i = 0; i < smallestNumber.length; i++)
			// i = 0 sets variable before running loop.
			// loop will run as long as i is less than the element in the array's value.
			// i++ increases the i variable in increments each time the program loops, it'll
			// continue to update the variable, thus counting the index.

			{
				if (min > smallestNumber[i]) {
					// if the current smallest value, or minimum, is greater than the next element's
					// value, than the loop will continue to run.
					min = smallestNumber[i];
					index = i;
				}
			}
			// 1 is added (i++) each time loop runs until minimum is found, then the "index"
			// variable is set to i and replaces 0.
			System.out.println(min);
			System.out.println(index + 1);

			// Index starts at 0 so adding one matches how the user physically counts.
			System.out.println("\n" + "Question 14: What is the number in the " + (index + 1)
					+ "nd spot of the following list? " + " \n (14, 12, 8, 15, 10).");

			Scanner answerFourteen = new Scanner(System.in);
			promptAnswer();
			String answer14 = answerFourteen.next();

			if (answer14.equals(min)) {
				System.out.println("Correct!");
			} else
				System.out.println("That is incorrect. The correct answer is " + min);
		}
	}
}
/*
 * Inheritance is a process where a new class is derived from an existing class
 * and acquires all of its properties and functions, that way you are only
 * maintaining and debugging a single copy of code.
 */

/*
 * Polymorphism is one of the pillars in OOP, it allows the user to define just
 * one interface and then gives it the ability to take on many different forms.
 */
