package assignment3_mit;

import java.util.Scanner;

public class StudentList {

	public static void main(String[] args) {

		// Instance Fields or variables
		String studentId, studentName, assignmentName;
		int userChoice, counterOfStudents = 0, counterOfAssignments = 0;
		int assignmentId[] = new int[5];
		double max_score, score_obtain, totalScore = 0, netScore = 0;
		boolean quit = true, exit = true;
		
		// Creating array of object
		Student[] student = new Student[20];
		Assignment[][] assignment = new Assignment[20][5];

		Scanner sc = new Scanner(System.in);
		
		//Loop for menu driven for user
		do {
			System.out.println("\nChoose operation you want to perform. (Press between 0 to 3).");
			System.out.println("1. Add a new student");
			System.out.println("2. Find and display existing student(Enter ID)");
			System.out.println("3. Display all the students data");
			System.out.println("Enter your choice, press 0 to quit.");

			userChoice = Integer.parseInt(sc.nextLine());
			quit = false;
			switch (userChoice) {

			case 1:			// Case 1 is for adding new student
				student[counterOfStudents] = new Student();

				// loop for checking unique student id
				do {
					System.out.print("Enter student id: ");
					studentId = sc.nextLine();
					exit = true;
					for (int i = 0; i <= counterOfStudents; i++) {
						if ((String.valueOf(student[i].getStudentID()).contains(studentId))) {
							System.out.printf("Error -- %s is already exist! Please enter new student ID.\n", studentId);
							break;
						}
						else {
							student[counterOfStudents].setStudentID(studentId);;
							exit = false;
							break;
						}
					}
					
				} while (exit);

				// loop for name validation
				do {
					System.out.print("Enter the name of student: ");
					studentName = sc.nextLine();

					if (student[counterOfStudents].setStudenName(studentName))
						break;
					else
						System.out.println("Error -- Please enter name first!!!");
				} while (true);

				
				String choice = "yes";
				for (int j = 0; choice.equalsIgnoreCase("yes");) {

					assignment[counterOfStudents][j] = new Assignment();

					// loop for checking unique assignment id
					do {
						System.out.print("Enter assignment id: ");
						assignmentId[j] = Integer.parseInt(sc.nextLine());
						exit = true;
						for (int i = 0; i <= counterOfAssignments; i++) {
							if ((String.valueOf(assignment[counterOfStudents][i].
									getAssignmentID()).contains(String.valueOf(assignmentId[j]))))
							{
								System.out.printf("Error -- %d is already exist! Please enter new  assignment id first!!!\n",
										assignmentId[j]);
								break;
							}
							else {
								assignment[counterOfStudents][j].setAssignmentID(assignmentId[j]);
								counterOfAssignments++;
								exit = false;
								break;
							}
						}
					} while (exit);

					// loop for name validation
					do {
						System.out.print("Enter assignment name: ");
						assignmentName = sc.nextLine();

						if (assignment[counterOfStudents][j].setAssignmentName(assignmentName))
							break;
						else
							System.out.println("Error -- Please enter assignment name first!!!");
					} while (true);

					// loop for MAX score validation
					do {
						System.out.print("Enter max score: ");
						max_score = Double.parseDouble(sc.nextLine());

						if (assignment[counterOfStudents][j].setMaximunScore(max_score)) {
							totalScore = totalScore + max_score;
							break;
						} else
							System.out.println("Error -- Please enter score between 1 to 10 !!!");
					} while (true);

					// loop for obtain score validation
					do {
						System.out.print("Enter the score student obtain: ");
						score_obtain = Double.parseDouble(sc.nextLine());

						if (assignment[counterOfStudents][j].setScoreObtain(score_obtain)) {
							netScore = netScore + score_obtain;
							break;
						} else
							System.out.println(
									"\nError -- Please enter score between " + assignment[counterOfStudents][j].MIN_SCORE
											+ " to " + assignment[counterOfStudents][j].maximunScoreTemp);
					} while (true);

					// terminate the inner for loop if user has no assignment or greather then 5 assignment
					System.out.print("\nDo you have more asssignment (yes -- to continue)? ");
					choice = sc.nextLine();
					if (choice.equalsIgnoreCase("yes")) {
						if (j >= 4) {
							System.out.println("Sorry, you can't add more than 5 assignments!!!");
							choice = "no";
							counterOfStudents++;
							break;
						} else {
							j++;
							continue;
						}
					} else {
						break;
					}
				}
				counterOfStudents++;				//for second student

				break;

			case 2:				// Case 2 is for display particular student record.
				System.out.println("Enter student id to find details: ");
				String id = sc.nextLine();
				for (int i = 0; i < counterOfStudents; i++) {
					for (int k = 0; k < counterOfAssignments; k++) {
						if ((String.valueOf(student[i].getStudentID()).contains(id))) {		//checking id is exits or not
							if (assignment[i][k] == null)
								break;
							else {
								System.out.println(student[i]);
								System.out.println(assignment[i][k]);
							}
						}
					}
				}

				break;

			case 3:				// Case 3 is for display all user data value
				for (int k = 0; k < counterOfStudents; k++) {
					System.out.println(student[k]);
					for (int k2 = 0; k2 < counterOfAssignments; k2++) {
						if (assignment[k][k2] == null)
							break;
						else
							System.out.println(assignment[k][k2]);
					}
					System.out.print("\n");
				}
				break;

			case 0: 		// Case 0 is for exit from the menu
				quit = true;
				System.out.println("All done!");
				break;

			default: 		// Default value is for validating the user choice
				System.out.println("\nWrong choice. Please enter between 0 to 3.");
				break;
			}
		} while (!quit);

	}
}