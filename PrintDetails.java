class Stud {
	int id; // Represents the ID of the student
	String name; // Represents the name of the student

	public void setStd() {
		id = 432; // Setting the ID of the student to 432
		name = "Sravan"; // Setting the name of the student to "Sravan"
		
		System.out.println(id + " " + name); // Printing the ID and name of the student
	}
}

public class PrintDetails {
	public static void main(String[] args) {
		Stud ob = new Stud(); // Creating an object of Stud class
		ob.setStd(); // Calling the setStd() method of Stud class
	}
}
