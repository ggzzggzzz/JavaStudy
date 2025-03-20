package kr.ac.kopo.assi_0307;

import java.util.Scanner;

/*
 * 
 1. 물건값과 지불한 돈을 입력받아 거스름돈과 1000원, 500원, 100원, 50원, 10원 개수를 출
력하는 프로그램을 작성하시오.
 물건값을 입력 : 6270 (키보드입력)
지불한 돈의 액수 입력 : 10000 (키보드입력)
 
 거스름돈 : 3730원
 1000원 : 3개
 500원 : 1개
 100원 : 2개
 50원 : 0개
 10원 : 3개
 물건값을 입력 : 6270
 지불한 돈의 액수 입력 : 5000
 1270원이 부족합니다.
 */
public class assi_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//거스름돈,       물건 가격,    지불한 돈 
		int change = 0, price = 0, pay = 0;
		
		System.out.print("물건값을 입력 : ");
		price = sc.nextInt();
		System.out.print("지불한 돈의 액수 입력 : ");
		pay = sc.nextInt();
		
		//만약 물건 가격보다 지불한 돈이 작은 경우
		if(pay - price < 0)
		{
			System.out.printf("%d원이 부족합니다.",price - pay);
		}
		else {
			change = pay - price;
			
			System.out.printf("거스름돈 : %d원\n", change);
			System.out.printf("1000원 : %d개\n", change /  1000);
			System.out.printf("500원 : %d개\n", change % 1000 / 500);
			System.out.printf("100원 : %d개\n", change % 500 / 100);
			System.out.printf("50원 : %d개\n", change % 100 / 50);
			System.out.printf("10원 : %d개\n", change % 50 / 10);
		}
		 
	}

}
