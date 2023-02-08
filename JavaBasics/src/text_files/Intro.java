package text_files;

import java.io.File;

//import org.apache.commons.io.FileUtils;

public class Intro {

	public static void main(String[] args) {
		
		/*
		 * Working with text files using Apache commons IO
		 * 
		 * 1.Add common IO jar files to java Build Path
		 * 3.Use FileUtils from commons-io to read a text file
		 */
		
		File file = new File("C:\\Users\\pidikiti.abhinash\\Desktop\\Abhi.txt");
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getAbsolutePath());
		
		//String x = FileUtils.readFileToString(file,"UTF-8");

	}

}
