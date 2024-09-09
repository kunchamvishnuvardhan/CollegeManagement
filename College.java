package Project5;
//Creating a class
public class College {
	// Array to store students
	 private Student[] students;// Variable to keep track of the number of students added
	 private int studentCount;
	 public College(int capacity) {  // Constructor to initialize the College object
		 this.students = new Student[capacity];
		 this.studentCount = 0;
	 }
	// Method to add a new student
public void addStudent(Student student) {
	if (studentCount < students.length) {
		students[studentCount] = student;
		studentCount++;
		} 
	else {
		System.out.println("College is full. Cannot add more students.");
	}
}
public void displayStudents() {   // Method to display all students
	for (int i = 0; i < studentCount; i++) {
		System.out.println("Name: " + students[i].getName());
		System.out.println("Roll Number: " + students[i].getRollNumber());
		System.out.println();
		}
	}
}

