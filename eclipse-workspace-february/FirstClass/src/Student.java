//Jessie Zarate 02/04/2025
public class Student {
	private int id;
	private int hours;
	private int points;
	private double gpa;
	
	public Student() {
		setId (9999);
		setPoints(12);
		setHours(3);
	}
	
	public double getGpa() {
		gpa = (double)points/(double)hours;
		return gpa;
	}
	public int getId() {
		return id;
	}
	public int getHours() {
		return hours;
	}
	public int getPoints() {
		return points;
	}
	public void setId(int ident) {
		id=ident;
	}
	public void setHours(int hrs) {
		hours= hrs;
	}
	public void setPoints(int pts) {
		points=pts;
	}
}
