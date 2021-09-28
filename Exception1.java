
public class Exception1 {
	public void test() throws Exception{
		throw new Exception("Error");
	}

	public static void main(String[] args) {
		try {
			Exception1 e1 = new Exception1();
			e1.test();
		}
		catch(Exception e) {
			System.out.println("No Exception");
		}

	}

}
