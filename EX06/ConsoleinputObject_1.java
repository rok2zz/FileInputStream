package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

//system.in : Consol에서 인풋을 받는 자바에서 제공해주는 객체
	//windows : \r\n 엔터 , Mac : \n 엔터

public class ConsoleinputObject_1 {

	public static void main(String[] args) throws IOException {

		//1. Consol에서 인풋 받기위한 객체 생성
		InputStream is1 = System.in;
		System.out.println("영문을 입력하세요. >>> ");
		int data;
		
		while((data = is1.read()) != '\r') { //\r 전까지 읽어서 넣음
			System.out.println("읽은 데이터 : " + (char)data + ", 남은 바이트 수 : " + is1.available());
		}
		System.out.println(data);
		System.out.println(is1.read());
		
		System.out.println("===============================");
		
		while((data = is1.read()) != '\r') { //\r 전까지 읽어서 넣음
			System.out.print((char)data);
		}

	}

}
