package Chap19.EX04;
/* 
 *  p.jangwoo@gmail.com , �� ���� ����Կ��Ե� ����, �Ϸ� �ð� : 11: 45�б��� 
 *  ��Ʈ : �迭�� �� 26�� �����ؼ� for ���� ����ؼ� ���. 
 A ~ Z ������ �ƽ�Ű �ڵ尪 ��� 
 
 ��°�� 
 ======================
 A,65
 B,66
 ...
 Z,90
 
 
  a ~ z ������ �ƽ�Ű �ڵ尪 ��� 
 
 ��°�� 
 ======================
a,97
b ,98
 ...
z,97
 
 
 */

public class Charator_EX2 {

	public static void main(String[] args) {
		
		//1. �빮�� :  A ~ Z ������ �ƽ�Ű �ڵ尪 ��� 

		System.out.println("1. �빮�� :  A ~ Z ������ �ƽ�Ű �ڵ尪 ��� ");
		System.out.println("========================================");
		System.out.println();
		
		for (int i=65 ; i < 91 ; i++) {	
				System.out.println((char)i + " , " + i);	
		}
		System.out.println();
		System.out.println();
		System.out.println("2. �ҹ��� :  a ~ z ������ �ƽ�Ű �ڵ尪 ��� ");
		System.out.println("========================================");
		System.out.println();
		
		for (int i=97 ; i < 123 ; i++) {	
			System.out.println((char)i + " , " + i);	
	}

	}

}
