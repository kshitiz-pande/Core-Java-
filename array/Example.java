package array;

import java.util.*;
public class Example {
	public static void main(String []args) 
	{
		int n;
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter the number of elements in array: ");  
		n = s.nextInt();  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{
			array[i]=s.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		for (int i=0; i<n; i++)   
		{  
			System.out.println(array[i]);  
		}
	}
}

