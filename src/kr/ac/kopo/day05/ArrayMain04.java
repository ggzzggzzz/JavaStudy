package kr.ac.kopo.day05;

import java.util.Scanner;

public class ArrayMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		
		for(int i = 0; i < 5;)
		{
			System.out.print("num" + (i+1) + ": ");
			
			arr1[i] = sc.nextInt();
			
			if(arr1[i] % 2 == 0)
				i++;
			
		}
		
		System.out.println("< PRINT >");
		for(int i = 0; i < 5; i++)
		{
			System.out.print(arr1[i] + " ");
			
		}
		
	}

}
