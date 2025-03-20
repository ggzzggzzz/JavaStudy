package kr.ac.kopo.day05;

import java.util.Scanner;

public class ArrayMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		int flag1 = 0;
		int flag2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < 10; i ++)
		{
			System.out.print("num" + (i+1) + ": ");
			arr1[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10; i ++)
		{
			if(arr1[i] % 2 == 1)
			{
				arr2[flag1] = arr1[i];
				sum1 += arr2[flag1];
				flag1++;
			}
			else
			{
				arr3[flag2] = arr1[i];
				sum2 += arr3[flag2];
				flag2++;
			}
			
		}
		System.out.println("< 짝수 >");
		
		for(int i = 0; i < flag2; i++)
			System.out.print(arr3[i] + " ");
		
		System.out.print("\n총합 : " + sum2);
		
		System.out.println("\n< 홀수 >");
		
		for(int i = 0; i < flag1; i++)
			System.out.print(arr2[i] + " ");
		
		System.out.print("\n총합 : " + sum1);
		

	}

}
