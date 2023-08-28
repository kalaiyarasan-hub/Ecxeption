package Exception;

public class Arrayindex {
public static void main(String[]args) {
	int[] a= {1,2,3};
	int b=a[0];
	int c =a[1];
	int d =a[2];
	
	try {
		
		int e =a[3];
		
		System.out.println(a);
		
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println(ae+"Exception handling");
		ae.printStackTrace();
		
		
	}
	finally {
		System.out.println("out ot fount");
	}
	System.out.println("rest of the code");
	
}
}
