package kr.ac.kopo.day05;

import java.util.Scanner;

public class ArrayMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		char[] grade = new char[5];
		int flag = 0;
		double sum = 0.00;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print(i + "’s 성적 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("번호\t성적\t학점");
		
		for(int i = 0; i < 5; i++)
		{
			if(arr[i] > 100 || arr[i] < 0) {
				System.out.printf("%d\tERROR!!!\n",arr[i]);
				flag++;
			}
				
			else {
				if (arr[i] / 10 == 0 || arr[i] / 10 == 9)
					grade[i] = 'A';
				if (arr[i] / 10 == 8)
					grade[i] = 'B';
				if (arr[i] / 10 == 7)
					grade[i] = 'C';
				if (arr[i] / 10 == 6)
					grade[i] = 'D';
				if (arr[i] / 10 == 5)
					grade[i] = 'E';
				if (arr[i] < 50)
					grade[i] = 'F';
				System.out.printf("%d\t%d\t%c\n",i,arr[i],grade[i]);
				
				sum = sum + arr[i];
			}
			
		}
		System.out.printf("5명 입력 중 [%d]회 에러발생!!!\n",flag);
		System.out.println("  총점 : " + sum + "점");
		System.out.printf("  평균 : %.2f", sum / (5 - flag) );

	}

}
