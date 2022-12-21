
class Personal {
	protected String name;
	protected int birthYear;

	public Personal(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
}

class Teacher extends Personal {
	protected String subject;

	public Teacher(String name, int bir, String subject) {
		super(name, bir);
		this.subject = subject;
	}
}

class Student extends Personal {
	protected String stuNo;
	protected int grade;

	public Student(String name, int bir, String stuNo, int grade) {
		super(name, bir);
		this.stuNo = stuNo;
		this.grade = grade;
	}
}

public class hw3 {

	public static void main(String[] args) {
		Personal[] persons = { new Student("A", 88, "940001", 1), new Student("B", 90, "940002", 2),
				new Teacher("C", 60, "English"), new Teacher("D", 54, "Chinese")

		};

	}

}
