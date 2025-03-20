package kr.ac.kopo.day05;

import java.util.Scanner;

public class ArrayMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print("정수 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("  < PRINT>");
		
		for(int i = 0; i < 5; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
		
		System.out.println("  < REVERSE>");
		
		for(int i = 4; i >= 0; i--)
		{
			
			if(arr[i] % 10 == 0)
				System.out.print( arr[i] / 10 + " " );
			else
				System.out.print(arr[i] % 10 + "" + arr[i] / 10 + " " );
			
			
			
		}
		
		
		
		
		
	}

}
