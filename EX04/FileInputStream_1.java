package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException {
		// 현재 작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir"));
		
		//1. 입력 파일 생성
		File inFile1 = new File("D:\\Chaerok\\Java\\src\\Chap19\\files\\FileInputStream1.txt");
		
		File inFile = new File("src\\Chap19\\files\\FileInputStream1.txt");
				
		InputStream is = new FileInputStream(inFile);
		

		//한 바이트 데이터를 읽어서 char로 변환 후 출력
		System.out.print(is.read()); // read() : 한 바이트를 읽음
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());

		System.out.println();
		InputStream is1 = new FileInputStream(inFile);
		int data;
		
		while((data = is1.read()) != -1) {
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println();
		System.out.println("======================");
		
		InputStream is2 = new FileInputStream(inFile);
		while((data = is2.read()) != -1) {
			System.out.println("읽은 데이터 : "+(char)data  + ", 남은 바이트 수 : " + is2.available());
		}
	}

}
