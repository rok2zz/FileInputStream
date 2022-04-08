package Chap19.EX03;

import java.nio.charset.Charset;

public class CreateCharsetObject {

	public static void main(String[] args) {
		//문자 인코딩 설정을 적용하는 방법
		//1. Charset.defaultCharset() : 시스템의 기본 설정 로드

		Charset cs1 = Charset.defaultCharset(); //정적메소드, 시스템의 기본 설정인 charset 로드
		System.out.println(cs1); //MS949 >> x-windows 949 : MS949의 확장버전
		
		//2. Charset.forName("MS949") : 직접 할당해서 사용
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4 = Charset.forName("EUC-KR"); //존재하지않는 인코딩을 넣으면 오류
		System.out.println(cs4);
		
		System.out.println();
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC-KR"));
		System.out.println(Charset.isSupported("UTF-16"));
	}

}
