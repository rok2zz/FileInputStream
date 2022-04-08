package Chap19.EX02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		//1. C:\에 작업 폴더 생성
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {
			tempDir.mkdir();
		}

		//2. 파일 객체 생성 (C:/windows)
		File file = new File("C:/windows");
		
		//3. 파일 객체의 여러 메소드 사용
		System.out.println("절대 경로 출력 : " + file.getAbsolutePath());
		System.out.println("폴더의 존재 유무 출력 : " + file.isDirectory());
		System.out.println("파일의 존재 유무 출력 : " + file.isFile());
		System.out.println("파일/폴더 이름 출력 : " + file.getName());
		System.out.println("부모 폴더 출력 : " + file.getParent());
		
		File newFile1 = new File("C:/temp/abc");
		System.out.println(newFile1.mkdir()); 
			//폴더가 잘 생성 한경우 true, 폴더가 이미 존재해서 생성 되지 못했을 때도 false
			//하위폴더도 못만듬 mkdir()은 한개만 생성
		System.out.println(newFile1.exists());
		
		File newFile2 = new File("C:/temp/bcd/cde");
		System.out.println(newFile2.mkdir()); //mkdir은 하위폴더 생성 불가
		System.out.println(newFile2.mkdirs()); //mkdirs : 하위폴더까지 생성
		
		File newFile3 = new File("C:/temp/def/hij/klm");
		System.out.println(newFile3.mkdirs());
		
		//4. File 객체를 사용해서 하위 폴더의 정보 추출
		File[] fname = file.listFiles(); // file: "C:/windows" 의 하위폴더, 파일 이름을 fname 배열에 ㅈ장
		
		for(File k : fname) {
			System.out.println((k.isDirectory() ? "폴더 : " : "파일 : ") + k.getName());
		}
	
	
	
	
	
	
	}

}
