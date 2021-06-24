package integrationproject;

/**
 * Creates a new class that should be called in Main to print a question for 
 * the user.
 */
public class QuestionSix {

  String question;
  int number;

  /** 
 * The getter and setter in this file should be used in place of question 6.
 */
  public static void main(String[] args) {
    // Based off Alex Lee Tutorials
    // creates object "u" 
    QuestionSix u = new QuestionSix();
    u.setQuestion("Question 6: What is the absolute value of");
    u.setNumber(-30);
    u.printDetails();

  }
  
  /** 
 * The variable at top of file, String question, is set equal to the 
 * parameter passed.

 * @param question A string that is a template question.
 */
  public void setQuestion(String question) {

    this.question = question;
    
  }
  
  public void setNumber(int number) {
    this.number = number;
  }
  // returns the question variable.
  
  public String getQuestion() {
    return this.question;
  }
  
  public Integer getNumber() {
    return this.number;
    
  }
  
  public void printDetails() {
    System.out.println(getQuestion() + getNumber() + "?");
  }
}
