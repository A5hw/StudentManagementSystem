import java.util.Scanner;

public class StudentMain {
 public static void main(String[] args) {
		StudentManagementSystem system = new StudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		   while (true) {
		   System.out.println("1. Add Student");
		   System.out.println("2. Remove Student");
		   System.out.println("3. Search Student");
	       System.out.println("4. Display All Students");
		   System.out.println("5. Exit");
		   System.out.print("Enter your choice: ");
		        int choice = scanner.nextInt();
      switch (choice) {
	     case 1:
		    System.out.print("Enter Name: ");
		    String name = scanner.next();
		    System.out.print("Enter Roll number: ");
		    int rollNumber = scanner.nextInt();
		    System.out.print("Enter Grade: ");
		    char grade = scanner.next().charAt(0);
            Student newStudent = new Student(name, rollNumber, grade);
		    system.addStudent(newStudent);
		    break;
		    
	     case 2:
	    	   System.out.print("Enter roll number to remove: ");
               int removeRollNumber = scanner.nextInt();
               system.removeStudent(removeRollNumber);
               break;                 
		 
	     case 3:
             
             System.out.print("Enter roll number to search: ");
             int searchRollNumber = scanner.nextInt();
             Student foundStudent = system.searchStudent(searchRollNumber);
             if (foundStudent != null) {
                 System.out.println("Student found: " + foundStudent);
             } else {
                 System.out.println("Student not found.");
             }
             break;

         case 4:
             
             system.displayAllStudents();
             break;

         case 5:
             
             System.out.println("Exiting Student Management System.");
             System.exit(0);
             break;

         default:
             System.out.println("Invalid choice. Please enter a valid option.");
           }
        }
     }

}
    

		                



