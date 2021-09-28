abstract class Addition{
	public abstract void sum();
}
class IntegerSum extends Addition{
	public void sum() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Sum of Integer: " + c);
	}
}
	class FloatSum extends Addition{
		public void sum() {
			float x=10.2f,y=20.5f,z;
			z=x+y;
			System.out.println("Sum of Float: " + z);
		}
	}
public class AbstractDemo {

	public static void main(String[] args) {
		IntegerSum s1 = new IntegerSum();
		s1.sum();
		FloatSum f1 = new FloatSum();
		f1.sum();
	}
}
