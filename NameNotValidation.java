package Exception;

public class NameNotValidation {
public static void main(String[]args)throws LoginException {
	String name ="";
	try {
		if(name==null|| name == "") {
			throw new NameNotFoundException("invalid");
		}
		else {
		System.out.println("sucess");	
	}
	}
	catch(NameNotFoundException a) {
		System.out.println(a.getMessage());
		a.printStackTrace();
	}
	finally {
		System.out.println("rest of the code");
	}
	
}
}
