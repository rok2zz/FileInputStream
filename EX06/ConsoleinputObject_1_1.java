package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

//system.in : Consol���� ��ǲ�� �޴� �ڹٿ��� �������ִ� ��ü
	//windows : \r\n ���� , Mac : \n ����

public class ConsoleinputObject_1_1 {

	public static void main(String[] args) throws IOException {

		//1. Consol���� ��ǲ �ޱ����� ��ü ����
		InputStream is1 = System.in;
		System.out.println("������ �Է��ϼ���. >>> ");
		int data;
		
		while((data = is1.read()) != '\r') { //\r ������ �о ����
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println(data);
		System.out.println(is1.read());
	}

}
