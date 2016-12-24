package lesson11.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedCharacterStreams {
	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new FileReader("poem.txt"));) {
            String s = null;
            while( ( s=in.readLine() ) != null ) {
                System.out.println(s);
            } 	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
