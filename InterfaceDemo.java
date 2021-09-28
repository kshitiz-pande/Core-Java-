interface I1{
	public static final int x = 100;
	void show();
	default void display() {
		System.out.println(x);
	}
}

class Test implements I1{
	public void show() {
		System.out.println("Interface Example ");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		t.show();
	}

}
