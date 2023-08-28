package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filenotfound {
public static void main(String[]args) throws FileNotFoundException,IOException {
	try {
	File f = new File("C://New folder/sample.txt");
	FileReader fr = new FileReader(f);
	int temp=0;
	while((temp=fr.read())!=-1) {
		System.out.println((char)(temp));
		
	}
}
	catch(FileNotFoundException fe) {
		fe.printStackTrace();
	}
	System.out.println('a'+'b');
	
}

}

