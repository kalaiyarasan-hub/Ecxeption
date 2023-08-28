package Exception;

public class ArithmaticException {
public static void main(String[]args) {
	int a= 100;
	int b =0;
//	int c =a/b;
//	System.out.println(c);
//	System.out.println("Drive has been completed");
	try {
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException ae) {
		System.out.println(ae+"values is zero");
	
	ae.printStackTrace();//identify error line
	}
	finally {
		System.out.println("Exception handling");
	}
	System.out.println("Rest of the code");
		System.out.println("hello");
	
	}

}

