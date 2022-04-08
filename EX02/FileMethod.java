package Chap19.EX02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		//1. C:\�� �۾� ���� ����
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {
			tempDir.mkdir();
		}

		//2. ���� ��ü ���� (C:/windows)
		File file = new File("C:/windows");
		
		//3. ���� ��ü�� ���� �޼ҵ� ���
		System.out.println("���� ��� ��� : " + file.getAbsolutePath());
		System.out.println("������ ���� ���� ��� : " + file.isDirectory());
		System.out.println("������ ���� ���� ��� : " + file.isFile());
		System.out.println("����/���� �̸� ��� : " + file.getName());
		System.out.println("�θ� ���� ��� : " + file.getParent());
		
		File newFile1 = new File("C:/temp/abc");
		System.out.println(newFile1.mkdir()); 
			//������ �� ���� �Ѱ�� true, ������ �̹� �����ؼ� ���� ���� ������ ���� false
			//���������� ������ mkdir()�� �Ѱ��� ����
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:/temp/bcd/cde");
		System.out.println(newFile2.mkdir()); //mkdir�� �������� ���� �Ұ�
		System.out.println(newFile2.mkdirs()); //mkdirs : ������������ ����
		
		File newFile3 = new File("C:/temp/def/hij/klm");
		System.out.println(newFile3.mkdirs());
		
		//4. File ��ü�� ����ؼ� ���� ������ ���� ����
		File[] fname = file.listFiles(); // file: "C:/windows" �� ��������, ���� �̸��� fname �迭�� ����
		
		for(File k : fname) {
			System.out.println((k.isDirectory() ? "���� : " : "���� : ") + k.getName());
		}
	
	
	
	
	
	
	}

}
