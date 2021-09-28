class Student{
void mca(){
System.out.println("Mca Students");
}
void btech() {
System.out.println("Btech STudents");
}
}
class FirstYear extends Student{
void mca() {
System.out.println("MCA First year");
}
}
public class OverridingDemo {
	public static void main(String[] args) {
		FirstYear f = new FirstYear();
		f.mca();
		f.btech();
		
		//Upcasting
		Student s = new FirstYear();
		s.btech();
		s.mca();
		
		//Downcasting
		FirstYear f1 =(FirstYear) s;
		f1.mca();
		f1.btech();
	}
}
