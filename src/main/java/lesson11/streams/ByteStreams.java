package lesson11.streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreams {
	public static void main(String[] args) {
		try (FileInputStream in = new FileInputStream("bytes.txt");) {
            int c=-1;
            while( ( c=in.read() ) != -1 ) {
            
                System.out.println(c + " " + (char) c );
            } 	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
