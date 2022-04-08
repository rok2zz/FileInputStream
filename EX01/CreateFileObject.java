package Chap19.EX01;

import java.io.File;
import java.io.IOException;

//���� : ��Ŭ�������� ������ ���� �� C:\�� ������ ���� �߻� ���� : ������ ���� �����ϸ� ��

//File ��ü ���� ���� �ĺ��ڸ� ������ ���
	//1. windows : String path = "C:\\abc\\abc.txt" or "C:/abc/abc.txt"
	//2. mac : String path = "C:/abc/abc.txt"

	//ȣȯ�� ���ؼ� ���������� ��� �� �� �ִ� �ڵ� �ۼ�
		// String path = "C:" + File.separator + "abc" + File.separator + "abc.txt"
public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		// 1. File ��ü�� ����ؼ� ���� ����
		File tempDir = new File("C:/temp001");
		
		if(!tempDir.exists()) { //�ش��ο� ������ ������ �����ϸ�  true
			tempDir.mkdir();	//���� ����
		}
		
		System.out.println(tempDir.exists());
		
		//2. File ��ü�� ����ؼ� ���� ����
		File newFile = new File("C:/newfile.txt"); 
		//C:\ ���� ������ ���� ������ ���� ���� ���� �߻� ����

		if(!newFile.exists()) {
			newFile.createNewFile();
		}
		System.out.println(newFile.exists());
		System.out.println();
		
		//3. ���� ������
		File newFile2 = new File("C:\\temp001\\newfile01.txt"); //windows 10 ���� ������
		File newFile3 = new File("C:/temp001/newfile01.txt"); //windows0, Mac
		if(!newFile2.exists()) {
			newFile2.createNewFile();
		}
		if(!newFile3.exists()) {
			newFile3.createNewFile();
		}
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		File newFile4 = new File("C:"+File.separator + "temp001" + File.separator + "newfile03.txt");
		if(!newFile4.exists()) {
			newFile4.createNewFile();
		}
		
		System.out.println(newFile4.equals(newFile4));
		
		//4. ���� ��η� ó��
		File newFile5 = new File("C:/temp001/newfile05.txt");
		System.out.println(newFile5.getAbsolutePath()); //������ ���
		
		//5. ��� ��η� ó�� : ������
		System.out.println(System.getProperty("user.dir"));
			//���� �۾� ���� ��ġ �˷���
		File newFile6 = new File("newFile06.txt"); // ��� ��η� ���
		if(!newFile6.exists()) {
			newFile6.createNewFile();
		}
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
	}

}
