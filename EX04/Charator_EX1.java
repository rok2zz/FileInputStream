package Chap19.EX04;

public class Charator_EX1 {

	public static void main(String[] args) {
		
		//1. char ===> int�� ��ȯ 
		
		char ch1 = 'A'; 					//char : 2byte    
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);
		System.out.println((int)ch1_1);
		
		char ch2 = 'Z'; 
		System.out.println(ch2);
		System.out.println((int)ch2); 
		
		//1-2. char �� ����(�ƽ�Ű �ڵ�) �� ������ �� �ִ�. 
		
		char ch3 = 66;         //<== char�� ���� ������ ������ �����ϴ�. 
		System.out.println(ch3);
		System.out.println((char)ch3);
		System.out.println((int)ch3);
		
		//2. int ====> char
		int ch4 = 65; 
		System.out.println(ch4);
		System.out.println((char)ch4);
		
		
		
		

	}

}
