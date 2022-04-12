package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//FileInputStream
//is1 : MS949 한글로 읽기 (try with resource), 예외처리
//is2 : UTF-8 한글로 읽기

public class EX04_FileInputStream_2 {

	public static void main(String[] args) {
		File inFile = new File ("src\\Chap19\\EX04\\files\\file-ms949.txt");
		File inFile2 = new File ("src\\Chap19\\EX04\\files\\file-UTF8.txt");
		byte[] byteArray1 = new byte[100];
		byte[] byteArray2 = new byte[100];
		
		try (
			InputStream is1 = new FileInputStream(inFile); 
			
		){
			int count1; 
			while ( (count1 = is1.read(byteArray1)) != -1  ) { 
				System.out.println(new String (byteArray1, Charset.forName("MS949")));
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("================================================");
		
		try (
				InputStream is2 = new FileInputStream(inFile); 
				
			){
				int count2; 
				while ( (count2 = is2.read(byteArray2)) != -1  ) { 
					System.out.println(new String (byteArray2, Charset.forName("UTF-8")));
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
	
	}

}
