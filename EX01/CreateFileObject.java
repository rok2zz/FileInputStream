package Chap19.EX01;

import java.io.File;
import java.io.IOException;

//주의 : 이클립스에서 파일을 생성 시 C:\에 생성시 오류 발생 가능 : 관리자 모드로 실행하면 됨

//File 객체 내의 폴더 식별자를 적용할 경우
	//1. windows : String path = "C:\\abc\\abc.txt" or "C:/abc/abc.txt"
	//2. mac : String path = "C:/abc/abc.txt"

	//호환을 위해서 공통적으로 사용 할 수 있는 코드 작성
		// String path = "C:" + File.separator + "abc" + File.separator + "abc.txt"
public class CreateFileObject {

	public static void main(String[] args) throws IOException {
		// 1. File 객체를 사용해서 폴더 생성
		File tempDir = new File("C:/temp001");
		
		if(!tempDir.exists()) { //해당경로에 폴더나 파일이 존재하면  true
			tempDir.mkdir();	//폴더 생성
		}
		
		System.out.println(tempDir.exists());
		
		//2. File 객체를 사용해서 파일 생성
		File newFile = new File("C:/newfile.txt"); 
		//C:\ 파일 생성시 권한 문제로 파일 생성 예외 발생 가능

		if(!newFile.exists()) {
			newFile.createNewFile();
		}
		System.out.println(newFile.exists());
		System.out.println();
		
		//3. 파일 구분자
		File newFile2 = new File("C:\\temp001\\newfile01.txt"); //windows 10 하위 버전용
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
		
		//4. 절대 경로로 처리
		File newFile5 = new File("C:/temp001/newfile05.txt");
		System.out.println(newFile5.getAbsolutePath()); //절대경로 출력
		
		//5. 상대 경로로 처리 : 권장함
		System.out.println(System.getProperty("user.dir"));
			//현재 작업 폴더 위치 알려줌
		File newFile6 = new File("newFile06.txt"); // 상대 경로로 출력
		if(!newFile6.exists()) {
			newFile6.createNewFile();
		}
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
	}

}
