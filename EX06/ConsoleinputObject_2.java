package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleinputObject_2 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;

		//1. 1byte ���� �б�
		int data;
		
		while((data = is.read()) != '\r') { //\r���� ��
			System.out.println((char) data);
		}

	}

}
