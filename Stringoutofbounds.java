package Exception;

public class Stringoutofbounds {
public static void main(String[]args) {
	String word="kalai";
	try {
	System.out.println(word.charAt(10));	
	}
	catch(StringIndexOutOfBoundsException a) {
		System.out.println(a+"out of bounds");
		a.printStackTrace();
	}
	finally {
		System.out.println("out of found");
	}
	System.out.println("rest of code");
}
}

