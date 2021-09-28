import java.util.Scanner;
  
public class ArrayIndex{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        try {
            for (int i = 0; i <=10; i++) {

                arr[i] = s.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error..try again");
        }
    }
}
