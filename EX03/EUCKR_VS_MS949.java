package Chap19.EX03;

import java.io.UnsupportedEncodingException;

//EUCKR : 한국 표준, 한글 표현가능, 전체중 표기 가능한것만 구성 되어있음.
//MS949 : microsoft에서 개발한 한글표기방식

//UTF-8 : 모든 서버(Web, FTP, Mail...)
	//영문 : 1byte
	//한글 : 3byte

//UTF-16 : 고정길이
	//한,영 : 2byte

//인코딩 타입 설정 순서 : 파일> 프로젝트 > 전역

//문자를 해당 인코딩 타입으로 바이트 스트림으로 생성 한 경우, 해당 인코딩 타입으로 조합을 해야 깨지지 않음

public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		byte[] b1 = "a".getBytes("EUC-KR");
		//오타 발생시 예외발생 : UnSupportedEncodingException
		
		byte[] b2 = "a".getBytes("MS949");
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1,"EUC-KR"));
		System.out.println("MS949");
		System.out.println();
		
		//2. 하늘을 byte로 내보내고 String으ㅜ로 가져오기
		byte[] b3 = "가".getBytes("EUC-KR");
		byte[] b4 = "가".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		System.out.println(new String(b3,"EUC-kr"));
		System.out.println(new String(b4,"MS949"));	
		System.out.println();
		
		//3. EUC-KR은 현재 사용 가능한 것만 표기
		//MS949는 11000자 모두 표기
		byte[] b5 = "가".getBytes("EUC-KR");
		byte[] b6 = "가".getBytes("MS949");
		System.out.println(b5.length);
		System.out.println(b6.length);
		System.out.println(new String(b5,"EUC-kr"));
		System.out.println(new String(b6,"MS949"));	
		System.out.println();
	
	}
}
