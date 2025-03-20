package assi_0312_class_array;

import java.util.Scanner;

public class IceCream {
	String[] name = new String[10];
	int[] price = new int[10];
	int count = 0;
	Scanner sc = new Scanner(System.in);

	void input(String name, int price, int i) {
		this.name[i] = name;
		this.price[i] = price;
	}

	void a() {
		System.out.print("아이스크림 몇 개 구입할래? : ");
        this.count = sc.nextInt();
	}

	void buy() {
	
		a();

		for (int i = 0; i < count; i++) {
			System.out.println("*** " + (i + 1) + "번째 아이스크림 구매 정보 입력 ***");
			System.out.print("아이스크림명 : ");
			String name = sc.next();
			System.out.print("아이스크림가격 : ");
			int price = sc.nextInt();

			input(name, price, i);
		}
		
		printBuy();
	}

	void printBuy() {

		int sum = 0;
		System.out.println("\n< " + count + "개 아이스크림 구매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");

		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "\t" + this.name[i] + "\t\t" + this.price[i]);
			sum += this.price[i];
		}
		System.out.println("총합 : " + sum + "원\n");
		reTry();
	}

	void reTry() {
		System.out.print("계속구매할까?(Y/N) => ");
		char choice = sc.next().charAt(0);

		if (choice == 'Y' || choice == 'y')
			buy();
		else if(choice == 'N' || choice == 'n')
			System.out.println("끝!!!");
		else
		{
			System.out.println("다시 입력해라");
			reTry();
		}
	}

}
