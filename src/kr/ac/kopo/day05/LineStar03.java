package kr.ac.kopo.day05;

import java.util.Scanner;

public class LineStar03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		System.out.println("Line : ");
		a = sc.nextInt();
		
		for(int i = 0; i < a; i++)
		{
			if(i < a / 2 )
			{
				for(int j = 0; j < i ; j++ )
					System.out.print(" ");
				for(int j = 0; j < 5 - i ; j++)
					System.out.print("*");
			}
			else
			{
				for(int j = 0; j < 8 - i ; j++ )
					System.out.print(" ");
				for(int j = 0; j < i - 3 ; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
