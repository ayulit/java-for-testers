package lesson09.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Start {

	public static void main(String[] args) {
		
		FileOutputStream fileOutputStream;
		PrintWriter printWriter;
		
		try {
			fileOutputStream = new FileOutputStream("logs/log.txt"); 
			printWriter = new PrintWriter(fileOutputStream);
			printWriter.println();			
		} catch (FileNotFoundException e) {
			System.err.println("File not found :(");
		}

	}

}
