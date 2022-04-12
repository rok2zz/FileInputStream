package Chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//FileOutputStream�� ����ؼ� �ѱ� �Է�
public class FileOutputStream_2_1 {

	public static void main(String[] args) throws IOException {
		//1. ������ ���� ����
		File OutFile = new File("src/Chap19/EX05/FileOutput2_1.txt");
		
		//2. n-byte ���� ����(byte[]�� ó������ ������ ����)
		OutputStream os1 = new FileOutputStream(OutFile);
		byte[] byteArray1 = "�ȳ��ϼ���".getBytes(Charset.forName("UTF-8"));
			//���ڿ� 2byte�� ó����
		os1.write(byteArray1);
		os1.write('\n');
		
		os1.flush();
		os1.close();
		
		//3. n-byte ����(byte[]�� offset~length ����)
		OutputStream os2 = new FileOutputStream(OutFile, true);
		byte[] byteArray2 = "�ݰ����ϴ�".getBytes(Charset.forName("UTF-8"));
		
		os2.write(byteArray2,0,byteArray2.length);
		
		os2.flush();
		os2.close();
		
		
		
		
		
	}

}
