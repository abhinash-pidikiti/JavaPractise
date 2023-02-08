package text_files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTofile {

	public static void main(String[] args) throws IOException {
		
		FileWriter f1 = new FileWriter("C:\\Users\\pidikiti.abhinash\\Desktop\\Abhi.txt");
		
		f1.write("Java is the prominent programming language ");
		f1.close();

	}

}
