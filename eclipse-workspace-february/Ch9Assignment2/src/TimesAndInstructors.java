import java.util.Scanner;

public class TimesAndInstructors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String courses[][] = new String[5][3];
		String courses1[][] = {
			    {"CIS 101", "Mon 9 am", "Johnson"},
			    {"MTH 202", "Tue 11 am", "Smith"},
			    {"ENG 150", "Wed 10 am", "Williams"},
			    {"CIS 101", "Thu 2 pm", "Johnson"}, // Duplicate for testing
			    {"SCI 300", "Fri 1 pm", "Clark"}
			};
		System.out.println("Please input 5 courses, their start dates and hour, and instructor");

	//	for(int i = 0; i < courses1.length; i++) {
	//		System.out.println("Course:");
	//		courses[i][0] = input.nextLine();
	//		System.out.println("Start Date:");
	//		courses[i][1] = input.nextLine();
	//		System.out.println("instructor:");
	//		courses[i][2] = input.nextLine();
	//	}
	
		String searchCourse = input.nextLine();
		boolean searchFound = false;
		for(int i =0; i < courses1.length; i++) {
			if(courses1[i][0].equalsIgnoreCase(searchCourse)) {
				System.out.println("\n Course: " + courses1[i][0] + "\t Date/Time: " + 
						courses1[i][1] + "\t Instructor: " + courses1[i][2]);
				searchFound = true;
			}
				
		}
		
		if(!searchFound) {
			System.out.println("Course was not found");
		}
		
		
		int b;
		int a;
		for(a =0; a < courses1.length; a++)
				System.out.println("course: " + courses1[a][0] + " Date: " + courses1[a][1]+ " instructor: " +  courses1[a][2]);
		
		for(int i = 0; i < courses1.length - 1; i++) {
			for(int c = i + 1; c < courses1.length; c++) {
				if(courses1[i][0].equalsIgnoreCase(courses1[c][0])) {
					System.out.println("course: " + courses1[i][0] + " Date: " + courses1[i][1] + "/"  
				+ courses1[c][1] + " instructor: " +  courses1[i][2]);
				}
			}
		}
		
	}

}
