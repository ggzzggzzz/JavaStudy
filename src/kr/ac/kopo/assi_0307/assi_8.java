package kr.ac.kopo.assi_0307;

import java.util.Random;

/*
 8. 369게임을 작성해보자 (3, 6, 9가 들어갈때마다 짝, 10의 배수마다 뽀송 출력)
 10~100사이의 임의의 정수를 추출하여 게임시작
 만일 추출된 정수가 81이라면....
 *** 369 게임 (1 ~ 81) 시작 ***
 */
public class assi_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int a = r.nextInt(100);
		
		
		System.out.printf(" *** 369 게임 (1 ~ %d) 시작 ***\n",a);
		for(int i = 1;i < a + 1; i++)
		{
			
			//10의 자리 숫자가 3, 6, 9 가 아니고 10으로 나누어 떨어지지 않으면 10의 자리 숫자 출력
			if( ((i / 10) != 3) && ( (i / 10) != 6) && ( (i / 10 != 9) ) && (i / 10) != 0 && (i % 10) != 0 )
				System.out.print(i / 10);
			//10의 자리 숫자가 3또는 6또는 9일경우 '짝' 출력 
			if( ((i / 10) == 3) || ( (i / 10) == 6) || ( (i / 10 == 9) ) ) {
				System.out.print("짝");
				//10의 자리 숫자가 3또는 6또는 9일경우를 만족하면서 일의 자리 숫자가 3또는 6또는 9일경우 '짝'출력 예)33 = 짝짝
				if( ((i % 10) == 3) || ( (i % 10) == 6) || ( (i % 10 == 9) ) )
					System.out.print("짝");
				//10의 자리 숫자가 3또는 6또는 9일경우를 만족하면서 일의자리 숫자가 0일 경우 10으로 나누었을 때의 몫 만큼 '뽀' 출력후 '송'출력
				if( (i % 10) == 0)
				{
					for(int j = 0; j < i / 10; j++)
					System.out.print("뽀");
					System.out.print("송");
				}
				
				//1의 자리 숫자까지 계산했으므로 아래 1의 자리 숫자 계산을 진행하지 않고 다음 반복문 진행
				System.out.println();
				continue;
				
			}
			//1의 자리 숫자 가 3,6,9,0 이 아닌 경우 숫자 출력
			if( ((i % 10) != 3) && ( (i % 10) != 6) && ( (i % 10 != 9) ) && (i % 10) != 0 )
				System.out.print(i % 10);
			//1의 자리 숫자가 3또는 6또는 9라면 '짝'출력
			if( ((i % 10) == 3) || ( (i % 10) == 6) || ( (i % 10 == 9) ) )
				System.out.print("짝");
			//1의 자리 숫자가 10으로 나누어 떨어져서 0이라면 10의로 나눈 값의 몫 만큼 '뽀' 출력후 '송' 출력
			if( (i % 10) == 0)
			{
				for(int j = 0; j < i / 10; j++)
				System.out.print("뽀");
				System.out.print("송");
			}
			System.out.println();
				
		}
		
		
	}

}
