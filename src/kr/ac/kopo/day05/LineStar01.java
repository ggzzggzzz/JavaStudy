package kr.ac.kopo.day05;

import java.util.Scanner;

public class LineStar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		System.out.println("Line : ");
		a = sc.nextInt();
		
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j <= i ; j++)
				System.out.print(" ");
			
			for(int j = 0 ; j < a-i ; j++)
				System.out.print("*");
			
			System.out.println();
		}

	}

}
