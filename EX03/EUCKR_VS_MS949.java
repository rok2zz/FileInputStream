package Chap19.EX03;

import java.io.UnsupportedEncodingException;

//EUCKR : �ѱ� ǥ��, �ѱ� ǥ������, ��ü�� ǥ�� �����Ѱ͸� ���� �Ǿ�����.
//MS949 : microsoft���� ������ �ѱ�ǥ����

//UTF-8 : ��� ����(Web, FTP, Mail...)
	//���� : 1byte
	//�ѱ� : 3byte

//UTF-16 : ��������
	//��,�� : 2byte

//���ڵ� Ÿ�� ���� ���� : ����> ������Ʈ > ����

//���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ���� �� ���, �ش� ���ڵ� Ÿ������ ������ �ؾ� ������ ����

public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		byte[] b1 = "a".getBytes("EUC-KR");
		//��Ÿ �߻��� ���ܹ߻� : UnSupportedEncodingException
		
		byte[] b2 = "a".getBytes("MS949");
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1,"EUC-KR"));
		System.out.println("MS949");
		System.out.println();
		
		//2. �ϴ��� byte�� �������� String���̷� ��������
		byte[] b3 = "��".getBytes("EUC-KR");
		byte[] b4 = "��".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		System.out.println(new String(b3,"EUC-kr"));
		System.out.println(new String(b4,"MS949"));	
		System.out.println();
		
		//3. EUC-KR�� ���� ��� ������ �͸� ǥ��
		//MS949�� 11000�� ��� ǥ��
		byte[] b5 = "��".getBytes("EUC-KR");
		byte[] b6 = "��".getBytes("MS949");
		System.out.println(b5.length);
		System.out.println(b6.length);
		System.out.println(new String(b5,"EUC-kr"));
		System.out.println(new String(b6,"MS949"));	
		System.out.println();
	
	}
}
