package Exception;

public class NullPointerEx {
public static void main(String[]args) {
	String word = "cuyyt"; 
	   int num=10;
	try {
		int len =word.length();
		int val=Integer.parseInt(word);
		int answer=num/len;
	}
	catch(NullPointerException n) {
		System.out.println(n+"word is null");
		n.printStackTrace();
	}
	catch(ArithmeticException a) {
		System.out.println(a+"can't divide by zero");
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	}
}

