package lesson09.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Write {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		try {
			writeToFile();
		} catch (FileNotFoundException e) {			
			System.err.println("File not found :(");
		}
		
		System.out.println("Bye");

	}

	private static void writeToFile() throws FileNotFoundException {
		FileOutputStream fileOutputStream;
		PrintWriter printWriter;

		fileOutputStream = new FileOutputStream("logs/log.txt"); 
		printWriter = new PrintWriter(fileOutputStream);
		printWriter.println();
		printWriter.close();
		
	}

}
