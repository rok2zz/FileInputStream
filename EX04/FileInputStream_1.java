package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException  {
		
		//���� �۾� ���丮 ��ġ Ȯ�� 
		System.out.println(System.getProperty("user.dir")); 
		
		//1. �Է� ���� ���� 
		    //�����η� ���� 
		File inFile1 = new File ("D:\\PJW\\JAVA\\src\\Chap19\\files\\FileInputStream1.txt");
		
			//����η� ���� : ���� �۾����丮�� �������� ���� 	
		File inFile = new File ("src\\Chap19\\files\\FileInputStream1.txt"); 
		
		//InputStream ��ü�� �����ؾ� ������ ������ ������ �ִ�. 
		InputStream is = new FileInputStream(inFile);   
			//InputStream�� �߻� Ŭ���� , ���� ��ü ������ �� �� ����, Ÿ�� ������ ���� �ϴ�. 
		
		//������ ������ ��� . 

		//UTF-8 : ���� : 1byte, �ѱ��� : 3byte 
		//MS949 : ���� : 1byte, �ѱ��� : 2byte
		//EUC-KR : ���� : 1byte, �ѱ��� : 2byte
		//UTF-16 : ����, �ѱ� : 2byte  , ù��° BOM  2byte <=  �ĺ��� 
		
		//JAVA���� �ٹٲ� ó�� 
		//	- UNIX    :   \n
		//  - Windows :  \r\n             <== \r�� ���� �ص���.      <== �ܼ��̳� �޸��忡�� enter :  \r\n        
		//  - MAC     :   \r
		
		//�� ����Ʈ �����͸� �о char�� ��ȯ�� ���. 
		System.out.print((char)is.read());           //read() �� ����Ʈ�� �о����
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
		System.out.println();
		System.out.println("==========================");
		
		//��Ʈ���� ���� ������ �޸𸮿��� ���� �ȴ�. ������ �б� ���ؼ��� ���ο� ��Ʈ���� ���� �ؾ� �Ѵ�. 
		
		
		// int read() : �� ����Ʈ�� �о ���� ������ ��� ����� ���� , ���� �����Ͱ� �������� ���� ��� -1 
		//while ���� ����ؼ� �ѹ��� ��� 
		
		InputStream is1 = new FileInputStream(inFile); 
		
		int data ;	
		while ((data = is1.read()) != -1 ) {   //������ ������ ��� ��ȯ  ( -1 : ���� ���̻� ���� ���� ������ -1)
			System.out.print((char) data);
		}
			// �߿� :is1.read() : 1byte �� �о� ����. ��ȯ Ÿ���� int �̴�. 
			// 
			// FileInputStream�� �ݵ�� index 0 ������ �о� ����.  �߰��� ������ �濡�� ���� �� ����. 
				//FileRamdomAccess�� ��� �ؼ� ������ index���� �о� ����. 
		
		System.out.println();
		System.out.println();
		
		System.out.println("=================================");
		
		// available() : ��Ʈ���� ���� ����Ʈ���� ���. 
		
		InputStream is2 = new FileInputStream(inFile);
		
		while ((data = is2.read()) != -1 ) {   //������ ������ ��� ��ȯ 
			System.out.println( "���� ������ : " + (char) data + "  ���� ����Ʈ �� : " + is2.available());
		}
		
	
		is.close();
		is1.close();
		is2.close(); 
		
		
		
		
	}

}
