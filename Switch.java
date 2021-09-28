import java.util.*;
public class Switch {

	public static void main(String[] args) {
		int n, num1 = 5, num2 = 153, m, sum = 0, reversed = 0, c = 0, a, temp;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the case option: ");  
		n = s.nextInt();  
		switch(n) {
		case 1:
			for(int i = 1; i <= 10; i++)
	        {
				 System.out.println(num1 + " * " + i + " = "+ num1 * i);
	        }
			break;
		case 2:
			 while(num2 > 0)
		        {
		            m = num2 % 10;
		            sum = sum + m;
		            num2 = num2 / 10;
		        }
		        System.out.println("Sum of Digits: "+sum);
		        break;
		case 3:
			 while(num2 != 0) {
			      int digit = num2 % 10;
			      reversed = reversed * 10 + digit;
			      num2 /= 10;
			    }
			    System.out.println("Reversed Number: " + reversed);
			    break;
		case 4:
			  temp = num2;  
			    while(num2 > 0)  
			    {  
			    a = num2 % 10;  
			    num2 = num2 / 10;  
			    c = c + (a * a * a);  
			    }  
			    if (temp == c)  
			    System.out.println(temp + " is an Armstrong number");   
			    else  
			    System.out.println(temp + " is Not an armstrong number");   
			    break;
		 default:
		        System.out.println("Error");
			}
		}
	}
