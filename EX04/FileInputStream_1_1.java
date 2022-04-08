package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1_1 {

	public static void main(String[] args) {
		File inFile = new File("src\\Chap19\\files\\FileInputStream1.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(inFile);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int data = 0;
		try {
			if(is != null) {
				is.close();
			}
			else {
				while((data = is.read()) != -1) {
					System.out.println((char) data);
				}
			}
		}
		catch(IOException e) {
			System.out.println("파일을 읽지 못하는 예외 발생");
		}
		System.out.println("==================");
		
		InputStream is2 = null;
		try {
			is = new FileInputStream(inFile);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int data2 = 0;
		try {
			if(is2 != null) {
				is2.close();
			}
			else {
				while((data = is2.read()) != -1) {
					System.out.println((char) data);
				}
			}
		}
		catch(IOException e) {
			System.out.println("파일을 읽지 못하는 예외 발생");
		}
	}

}
