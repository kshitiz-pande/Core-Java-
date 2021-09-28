import java.util.Scanner;
public class ExceptionHandling {
	public void division() {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			c = a/b;
			System.out.println("Result is: "+ c);
		}
		catch(ArithmeticException e) {
			System.out.println("Number cannot divide by zero");
		}

	}

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.division();
	
	}

}
