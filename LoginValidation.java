package Exception;


public class LoginValidation {
public static void main(String[]args)throws LoginException {
	String username ="admin";
	String password ="012";
	
	try {
	if(username.equals("admin")&&password.equals("01234")) {
	System.out.println("login successful");
}
	else {
	throw new LoginException("invalid declaration");
	
}
}
catch(LoginException a) {
	System.out.println(a.getMessage());
	a.printStackTrace();
	
}
}
}