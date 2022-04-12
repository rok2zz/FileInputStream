package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*     �Ϸ� : 1: 20�б��� . 
 	1. is1   <== InputStream ��ü    (�����η� ����: -ms949.txt),  ����ó��
 	2. is2   <== InputStream ��ü		(����η� ����: -utf-8.txt),  ����ó�� (try ~ with resource�� ����ó��)
 			     close()�޼ҵ带 �ڵ����� ó�� 
 	
 	������ǲ��Ʈ������ �о ��� �ϼ���. 
 	
 			  
 */

public class EX3_Exception1 {
	public static void main(String[] args) {
		
		//1. is1 :(�����η� ����: -ms949.txt),  ����ó��   <== try() catch�� ������ ���ܷ� ó�� 
		
		File inFile = new File("D:\\PJW\\JAVA\\src\\Chap19\\EX04\\exception-ms949.txt");
		
		InputStream is1 = null;			//���� ������ ����. finally������� is1.close()
		byte[] arr = new byte[100];
		
		try {
			is1 = new FileInputStream(inFile);		//��ü����. FileInputStream�� FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("������ ���� ���� �ʽ��ϴ�. ");
		}
		int data = 0;
		try {
			while((data = is1.read(arr)) != -1) {     // IOException 
				String str = new String(arr, 0, data, Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�. ");
		}finally {
			if (is1 !=null) {
				try {
					is1.close();
				} catch (IOException e) {					
				}
			}
		}
		
		System.out.println("=============================");
		
		
		//1-1. ���� Exception�� ���ؼ� ���� try ~ catch �� ó�� 
		InputStream is1_1 = null;			//���� ������ ����. finally������� is1.close()
		byte[] arr1_1 = new byte[100];     
				// �ѱ� ó�� #1 : byte[] �迭 ����. 
		
		int data1_1 = 0;
		try {
			is1_1 = new FileInputStream(inFile);         //FileNotFoundException
			while((data1_1 = is1_1.read(arr1_1)) != -1) {	 //IOException 
				//�ѱ� ó�� #2 : read(byte�迭) 
				
				String str1_1 = new String(arr1_1, 0, data1_1, Charset.forName("MS949"));
					//�ѱ� ó��#3  :  new String(byte�迭, offset,length, "encoding")
				
				System.out.println(str1_1);
			}
		} catch (IOException e) {
			System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�. ");
		}finally {
			
			if (is1_1 != null) {
				try {
					is1_1.close();
				} catch (IOException e) {
				}
			}
		}
		
		System.out.println("=============================");	
		
		
		
		
		
		// 2. is2 : (����η� ����: -utf-8.txt),  ����ó�� (try ~ with resource�� ����ó��)

		File inFile2 = new File("src\\Chap19\\EX04\\exception-utf8.txt");
		
		byte[] arr2 = new byte[100];
			//�ѱ�ó�� #1 ; 
		int data2 = 0;

		try ( InputStream is2 = new FileInputStream(inFile2) ) {
			// try (with resource : ��ü ����, RAM�� ���)  <== close() �ڵ����� ó���ȴ�. AutoCloseable�� close() ������ Ŭ�����̾�� �Ѵ�.  
			
			while ( (data2 = is2.read(arr2)) != -1) { 
				//�ѱ�ó�� #2 : is.read(byte�迭);
								
				String str2 = new String(arr2, Charset.forName("UTF-8"));
					//�ѱ�ó�� #3 :   new String( byte�迭[, offset, length] , "encoding")
				System.out.println(str2);
			}
		}  catch (IOException e) {
			System.out.println("���ܰ� �߻� �߽��ϴ�. ");
		} 			
	}

	}


