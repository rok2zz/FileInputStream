package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileInputStream_1 {

	public static void main(String[] args) throws IOException {
		// ���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		
		//1. �Է� ���� ����
		File inFile1 = new File("D:\\Chaerok\\Java\\src\\Chap19\\files\\FileInputStream1.txt");
		
		File inFile = new File("src\\Chap19\\files\\FileInputStream1.txt");
				
		InputStream is = new FileInputStream(inFile);
		

		//�� ����Ʈ �����͸� �о char�� ��ȯ �� ���
		System.out.print(is.read()); // read() : �� ����Ʈ�� ����
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
			System.out.println("���� ������ : "+(char)data  + ", ���� ����Ʈ �� : " + is2.available());
		}
	}

}
