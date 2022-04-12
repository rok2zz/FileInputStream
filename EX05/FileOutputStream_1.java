package Chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : 추상클래스 <== FileInputStream 구현 : byte단위 데이터 읽기
//OutputStream도 같음 : 쓰기

//windows 콘솔, 메모장에 enter 넣으면 

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		//1. 입력 파일 생성(존재하지 않음)
		File outFile = new File("src/Chap19/EX05/FileOutput1.txt");
		
		//2. 1-byte 읽기
		OutputStream os1 = new FileOutputStream(outFile);
			//FileOutputStream : 존재하지않는 파일을 넣으면 실행시 파일 생성
			//FileInputStream : 경로에 파일이 존재해야함 없으면 예외발생 
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); //13 엔터
		os1.write('\n'); //10 엔터
		//중요 : write() 메소드는 버퍼(RAM)에 쓰기, 버퍼가 꽉 차면 파일에 쓰기
		//flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰기
		
		os1.flush(); // 생략가능하지만, 사용 권장
		os1.close(); //close 호출시 flush 먼저
		
		//3. n-byte 단위 쓰기 : byte[]의 offset부터 length 개의 byte 데이터 쓰기
		OutputStream os2 = new FileOutputStream(outFile, true); //덮어쓰기
								//
		byte[] byteArray1 = "Hello!".getBytes(); //String > byte 변환 : getBytes()
		
		os2.write(byteArray1);
		os2.write('\n'); //windows 에서 \r 생략해도 엔터 기능
		
		os2.flush();
		os2.close();
		
		//4. n-byte 단위 쓰기(byte[]의 offset 부터 length개의 byte 데이터 쓰기
		OutputStream os3 = new FileOutputStream(outFile, true);
		
		byte[] byteArray2 = "better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2,0,byteArray2.length);
		os3.write('\n'); //windows 에서 \r 생략해도 엔터 기능
		
		os3.flush();
		os3.close();
	}

}
