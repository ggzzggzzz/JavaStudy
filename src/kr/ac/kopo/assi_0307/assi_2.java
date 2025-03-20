package kr.ac.kopo.assi_0307;
/*
 * 2. 모음의 유니코드값을 출력하시오
문자 유니코드값
------------------------- 
A 65
E 69
I 73
O 79
U 85
 */
public class assi_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("문자\t유니코드값");
		System.out.println("------------------------");
		System.out.printf("%c\t%d\n",'A',(int)'A');
		System.out.printf("%c\t%d\n",'E',(int)'E');
		System.out.printf("%c\t%d\n", 'I', (int)'I');
		System.out.printf("%c\t%d\n", 'O', (int)'O');
		System.out.printf("%c\t%d\n", 'U', (int)'U');
	}

}
