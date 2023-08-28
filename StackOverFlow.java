package Exception;

public class StackOverFlow {
public void callA() {
	callB();}
	public void callB() {
	callA();
	}
	public static void main(String[]args) {
		StackOverFlow s =new StackOverFlow();
	s.callA();
	}
}

