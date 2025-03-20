package kr.ac.kopo.day03;

import java.util.Random;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		System.out.println("정수 출력: " + num);
		
		System.out.print("실수 입력: ");
		
		double a = sc.nextDouble();
		
		System.out.println("실수 출력: " + a);
		
		
		Random r = new Random();
		int random = r.nextInt();
		
		System.out.print("랜덤 정수 출력: " + random);
	}

}
