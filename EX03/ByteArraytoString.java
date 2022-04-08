package Chap19.EX03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1. String getBytes() : String => Byte[]�� ����
			// ���ڸ� byte�� �迭�� ����
		byte[] array1 = "�ȳ�".getBytes(); //Charset ���� x
		byte[] array2 = "��ť".getBytes(Charset.defaultCharset());
		byte[] array3 = "����".getBytes(Charset.forName("MS949"));
		byte[] array4 = "��ť".getBytes("UTF-8");

		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(array4.length);
		System.out.println("==================");
		
		// 2. new String() " Byte[] >> String���� ��ȯ
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	}

}
