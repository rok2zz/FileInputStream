package Chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : �߻�Ŭ���� <== FileInputStream ���� : byte���� ������ �б�
//OutputStream�� ���� : ����

//windows �ܼ�, �޸��忡 enter ������ 

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		//1. �Է� ���� ����(�������� ����)
		File outFile = new File("src/Chap19/EX05/FileOutput1.txt");
		
		//2. 1-byte �б�
		OutputStream os1 = new FileOutputStream(outFile);
			//FileOutputStream : ���������ʴ� ������ ������ ����� ���� ����
			//FileInputStream : ��ο� ������ �����ؾ��� ������ ���ܹ߻� 
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); //13 ����
		os1.write('\n'); //10 ����
		//�߿� : write() �޼ҵ�� ����(RAM)�� ����, ���۰� �� ���� ���Ͽ� ����
		//flush() : ���ۿ� ����� ������ ���Ͽ� ������ ����
		
		os1.flush(); // ��������������, ��� ����
		os1.close(); //close ȣ��� flush ����
		
		//3. n-byte ���� ���� : byte[]�� offset���� length ���� byte ������ ����
		OutputStream os2 = new FileOutputStream(outFile, true); //�����
								//
		byte[] byteArray1 = "Hello!".getBytes(); //String > byte ��ȯ : getBytes()
		
		os2.write(byteArray1);
		os2.write('\n'); //windows ���� \r �����ص� ���� ���
		
		os2.flush();
		os2.close();
		
		//4. n-byte ���� ����(byte[]�� offset ���� length���� byte ������ ����
		OutputStream os3 = new FileOutputStream(outFile, true);
		
		byte[] byteArray2 = "better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2,0,byteArray2.length);
		os3.write('\n'); //windows ���� \r �����ص� ���� ���
		
		os3.flush();
		os3.close();
	}

}
