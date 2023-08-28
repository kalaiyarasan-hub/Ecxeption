package Exception;

public class NullPointer {
public static void main(String[]args) {
	String word =null;
	//System.out.println(word.toUpperCase());
	try {
		System.out.println(word.toUpperCase());
	}
	catch(Exception nul) {
		System.out.println(nul+"values is null");
		nul.printStackTrace();
	}
	finally {
		System.out.println("handle");
		
	}
	System.out.println("rest of the code");
}
}
