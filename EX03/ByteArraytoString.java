package Chap19.EX03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1. String getBytes() : String => Byte[]로 분해
			// 문자를 byte로 배열에 저장
		byte[] array1 = "안녕".getBytes(); //Charset 지정 x
		byte[] array2 = "땡큐".getBytes(Charset.defaultCharset());
		byte[] array3 = "베리".getBytes(Charset.forName("MS949"));
		byte[] array4 = "땡큐".getBytes("UTF-8");

		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(array4.length);
		System.out.println("==================");
		
		// 2. new String() " Byte[] >> String으로 변환
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
	}

}
