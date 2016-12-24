package lesson11.streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedByteStreams {
	public static void main(String[] args) {
		try (InputStream in = new BufferedInputStream(new FileInputStream("bytes.txt"));) {
            int c=-1;
            while( ( c=in.read() ) != -1 ) {
            
                System.out.println(c + " " + (char) c );
            } 	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
