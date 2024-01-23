package de.demmer.dennis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("files/faust.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			
			int temp = isr.read();
			
			while(temp >= 0) {
				System.out.print((char)temp);
				temp = isr.read();
			}
			isr.close();
			fis.close();
			
		} catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	

}
