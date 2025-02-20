package java_task7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  filepath = "file.txt";
		try {
		File file = new File(filepath);
		FileReader filereader = new FileReader(file);
		BufferedReader Br = new BufferedReader(filereader);
		String line;
		
		while((line = Br.readLine()) !=null) {
			System.out.println(line);
		}
		Br.close();
	}
	catch(java.io.FileNotFoundException e) {
		System.out.println("Error: The Specified file not exist");
	}
	catch(IOException e) {
		System.out.println("Error: While reading a file");
	}
  }
}
