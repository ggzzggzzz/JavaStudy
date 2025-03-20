package assi_0314;

import java.util.Random;

public class Bbosong {

	Random a = new Random();
	int r = a.nextInt(101);
	

	 public Bbosong() {
		 
		 System.out.printf("*** 369 게임 (1 ~ %d) 시작 ***\n", r);
		 
	        for (int j = 1; j <= r; j++) {
	            game(j);
	            System.out.println(); 
	        }
	    }

	

	void game(int num) {

		boolean flag = false;

		if (is369(num / 10)) {
			System.out.print("짝");
			flag = true;
		}

		if (is369(num % 10)) {
			System.out.print("짝");
			flag = true;
		}

		if (num % 10 == 0) {
			for (int i = 0; i < num / 10; i++)
				System.out.print("뽀");
			System.out.print("숑");
			flag = true;
		}
		
		if (flag == false)
			System.out.print(num);

	}
	boolean is369(int num) {
		if (num == 3 || num == 6 || num == 9)
			return true;
		else
			return false;
	}

}
