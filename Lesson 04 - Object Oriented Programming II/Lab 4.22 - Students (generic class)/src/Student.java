
public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private Double GPA;
	
	public Student(String first, String last, double gradeAverage) {
		this.firstName = first;
		this.lastName = last;
		this.GPA = gradeAverage;
	}
	
	
	@Override
	public int compareTo(Student otherStudent) {
		int comparisonVal;
		
		comparisonVal = this.GPA.compareTo(otherStudent.GPA);
		comparisonVal *= -1;
		
		if (comparisonVal == 0) {
			comparisonVal = this.lastName.compareTo(otherStudent.lastName);
		}
		
		if (comparisonVal == 0) {
			comparisonVal = this.firstName.compareTo(otherStudent.firstName);
		}
		
		return comparisonVal;
	}
	
	
	public String toString() {
		String value;
		value = String.format("%.2f %s, %s", this.GPA, this.lastName, this.firstName);
		
		return value;
	}
	
}
