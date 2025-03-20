package kr.ac.kopo.day05;

import java.util.Scanner;

public class LineStar02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		System.out.println("Line : ");
		a = sc.nextInt();
		
		if (a % 2 == 0) 
			a++;
		for(int i = 0; i < a; i++)
		{
			if(i < a / 2 )
			{
				for(int j = 0; j <i + 1; j++ )
					System.out.print("*");
			}
			else
			{
				for(int j = 0; j < a - i  ; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
