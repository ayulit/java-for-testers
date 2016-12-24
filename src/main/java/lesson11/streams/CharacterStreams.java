package lesson11.streams;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStreams {
	public static void main(String[] args) {
		try (FileReader in = new FileReader("bytes.txt");) {
            int c=-1;
            while( ( c=in.read() ) != -1 ) {
            
                System.out.println(c + " " + (char) c );
            } 	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
