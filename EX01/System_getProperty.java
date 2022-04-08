package Chap19.EX01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() 메소드의 유용한 정보들
		System.out.println(System.getProperty("user.dir")); //현재 작업 디렉토리
		System.out.println(System.getProperty("java.version")); //자바 버전
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("user.name")); //로그인한 계정
		System.out.println(System.getProperty("user.home")); // 홈폴더
		System.out.println(System.getProperty("os.name")); // os정보
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("file.separator")); //파일 구분자
		System.out.println(System.getProperty("path.separator"));
		System.out.println(System.getProperty("line.separator"));
		
	}
}
