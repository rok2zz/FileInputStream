package Chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//FileOutputStream을 사용해서 한글 입력
public class FileOutputStream_2_1 {

	public static void main(String[] args) throws IOException {
		//1. 저장할 파일 생성
		File OutFile = new File("src/Chap19/EX05/FileOutput2_1.txt");
		
		//2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 쓰기)
		OutputStream os1 = new FileOutputStream(OutFile);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
			//한자에 2byte씩 처리됨
		os1.write(byteArray1);
		os1.write('\n');
		
		os1.flush();
		os1.close();
		
		//3. n-byte 쓰기(byte[]의 offset~length 쓰기)
		OutputStream os2 = new FileOutputStream(OutFile, true);
		byte[] byteArray2 = "반갑습니다".getBytes(Charset.forName("UTF-8"));
		
		os2.write(byteArray2,0,byteArray2.length);
		
		os2.flush();
		os2.close();
		
		
		
		
		
	}

}
