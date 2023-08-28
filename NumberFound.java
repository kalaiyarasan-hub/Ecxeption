package Exception;

public class NumberFound {
public static void  main(String[]args) {
	String word ="";
	try {
		int num =Integer.parseInt(word);
		System.out.println(word);
		
	}
	catch(NumberFormatException n) {
		System.out.println(n+"word is number");
		n.printStackTrace();
	
	}
	finally{
		System.out.println("rest of the code");
	}
	//System.out.println("new key");
}
}
