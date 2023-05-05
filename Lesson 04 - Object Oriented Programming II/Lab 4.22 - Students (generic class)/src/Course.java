
public class Course implements Comparable<Course> {
	private String department;
	private Integer number;
	
	
	public Course(String dept, Integer num) {
		this.department = dept;
		this.number = num;
	}
	
	
	@Override
	public int compareTo(Course otherCourse) {
		int comparisonVal;
		
		comparisonVal = this.department.compareTo(otherCourse.department);
		
		if (comparisonVal == 0) {
			comparisonVal = this.number.compareTo(otherCourse.number);
		}
		
		return comparisonVal;
	}
	
	
	public String toString() {
		String value = this.department + " " + this.number;
		return value;
	}
	
}
