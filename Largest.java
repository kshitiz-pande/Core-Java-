import java.util.*;
public class Largest {
	public static void main(String[]args) {
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter three numbers: ");  
		a= s.nextInt(); 
		b= s.nextInt(); 
		c= s.nextInt();
		if(a>b && a>c) {
			System.out.println(a + " is largest");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is largest");
		}
		else if(c>a && c>b) {
			System.out.println(c + " is largest");
		}
	}
}
