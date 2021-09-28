package Static;

public class StaticExample {
	public static int a;
	static {
		a = 50;
		System.out.println("Static value of x is: "+a);
	}
	{
	System.out.println("Instance Block");	
	}
	public static void show() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		StaticExample s1 = new StaticExample();
		StaticExample s2 = new StaticExample();
		StaticExample.show();
	}

}
