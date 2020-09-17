package Challenge30DaysOfCode.Day12Inheritance;

/**
 * @author Sophia Kaya
 */

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
	System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

public class Student extends Person {

    private int[] testScores;

    /*
     * Class Constructor
     * 
     * @param firstName - A string denoting the Person's first name.
     * 
     * @param lastName - A string denoting the Person's last name.
     * 
     * @param id - An integer denoting the Person's ID number.
     * 
     * @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] testScores) {
	super(firstName, lastName, identification);
	this.testScores = testScores;
    }
    /*
     * Method Name: calculate
     * 
     * @return A character denoting the grade.
     */
    // Write your method here

    public char calculate() {

	double average = 0.00;

	for (int i = 0; i < this.testScores.length; i++) {
	    average = average + this.testScores[i];
	}
	average = average / this.testScores.length;

	char grade = 0;

	if (average >= 90 && average <= 100)
	    grade = 'O';
	if (average >= 80 && average < 90)
	    grade = 'E';
	if (average >= 70 && average < 80)
	    grade = 'A';
	if (average >= 55 && average < 70)
	    grade = 'P';
	if (average >= 40 && average < 55)
	    grade = 'D';
	if (average < 40)
	    grade = 'T';

	return grade;

    }

}
