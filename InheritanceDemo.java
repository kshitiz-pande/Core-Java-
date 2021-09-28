interface I2{
	void show();
}
interface I3{
	void display();
}
class Test1 implements I2,I3{
	public void show() {
		System.out.println("Interface Example");
	}
	public void display() {
		System.out.println("Multiple Interface Example");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.show();
		t.display();

	}

}
