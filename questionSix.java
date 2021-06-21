package integrationProject2006;
// Based off Alex Lee Tutorials
public class questionSix {
	String question;
	int number;

	public static void main(String[] args) {
		questionSix  u = new questionSix();
		u.setQuestion("Question 6: What is the absolute value of");
		u.setNumber(-30);
		u.printDetails();

	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setNumber(int number) {
		this.number = number;
	}
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
