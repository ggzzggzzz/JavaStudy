package kr.ac.kopo.assi_0307;

import java.util.Scanner;

/*
 * 
 4. 4개의 정수를 입력받아 가장 큰수를 출력하는 코드를 작성하시오
 4개 정수를 입력 : 45 9 11 52 (키보드입력)
 가장 큰수 : 52
 */
public class assi_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int max,a,b,c;
		
		System.out.print("4개 정수를 입력: ");
		max = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(max < a)
			max = a;
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		
		System.out.printf("가장 큰수: %d",max);
		
		
	}

}
