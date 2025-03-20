package kr.ac.kopo.assi_0307;

import java.util.Scanner;

/*
 * 
3. 3개의 정수를 입력받아 큰수에서 작은수 순으로 출력하는 코드를 작성하시오. 
첫 번째 정수 : 45 (키보드입력)
두 번째 정수 : 23 (키보드입력)
세 번째 정수 : 99 (키보드입력)
99 45 23
 */
public class assi_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, max = 0, mid = 0, min = 0;
		
		System.out.print("첫 번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		b = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		c = sc.nextInt();
		
		if(a >= b && a >= c)
			max = a;
		else if(b >= a && b >= c)
			max = b;
		else if(c >= a && c >= b)
			max = c;
		
		if((a >= b && a <= c) || (a >= c && a <= b) )
			mid = a;
		else if((b >= a && b <= c) || (b >= c && b <= a))
			mid = b;
		else if((c >= a && c <= b) || (c >= b && c <= a))
			mid = c;
		
		if(a <= b && a <= c)
			min = a;
		else if(b <= a && b <= c)
			min = b;
		else if(c <= a && c <= b)
			min = c;
		
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",mid);
		System.out.printf("%d\n",min);
		
		
		
		
	}

}
