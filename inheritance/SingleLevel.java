package inheritance;

class Student {
	public void branch() {
		System.out.println("All Students");
	}
}
class Mca extends Student{
	public void mcabranch() {
		System.out.println("MCA Students");
	}
}
public class SingleLevel{
	public static void main(String[] args) {
		Mca m = new Mca();
		m.mcabranch();
		m.branch();
	}
}
