package Project5;
import java.util.Scanner;
//Creating a class
public class CollegeManagement {
	public static void main(String[] args) { //Main method
        College college = new College(10); // Create a College object with a capacity of 10 students
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
     
        while (true) {  // Display menu options
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:  // Add a new student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student roll number: ");
                    String rollNumber = scanner.nextLine();
                    college.addStudent(new Student(name, rollNumber));
                    break;
                case 2:   // Display all students
                    college.displayStudents();
                    break;
                case 3:   // Exit the program
                    System.out.println("Exiting...");
                    System.out.println("Thankyou");
                    return;
                default: //invalid scenarios
                    System.out.println("Invalid choice. Please try again.");
            }//End of switch case
        }//End of while loop
	}//End of Main method
}//End of class block
