package kr.ac.kopo.day07;

import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개 살래?");
		int cnt = sc.nextInt();
		IceCream[] iceArr = new IceCream[cnt];
		
		for(int i = 0; i < iceArr.length; i++)
		{
			iceArr[i] = new IceCream();
			System.out.println("아이스크림정보입력");
			
			System.out.println("아이스크림명 : ");
			
			iceArr[i].name = sc.nextLine();
			
			//iceArr[i].name = sc.nextLine(); // 주소값을 저장하는 공간을 만든거라 오류 뜸 
			
		}
	}

}
