//Jessie Zarate 02/04/2025

public class ShowStudent {

	public static void main(String[] args) {
		Student first = new Student();
		Student second = new Student();
		first.setId(123);
		first.setHours(3);
		first.setPoints(12);
		System.out.println("Id " + first.getId());
		System.out.println("Hours " + first.getHours());
		System.out.println("points " + first.getPoints());
		System.out.println("GPA " + first.getGpa());
		System.out.println("----------------------------");
		System.out.println("Id " + second.getId());
		System.out.println("Hours " + second.getHours());
		System.out.println("points " + second.getPoints());
		System.out.println("points " + second.getGpa());
		

	}

}
