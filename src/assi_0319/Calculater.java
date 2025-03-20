package assi_0319;

import java.util.Random;
import java.util.Scanner;

public class Calculater extends Info {



	double circle(int r) {

		return r * r * 3.141592;

	}

	double triangle(int w, int h) {

		return (double)w * h / 2;

	}

	int squre(int r) {

		return r * r ;

	}

	int ractangle(int w, int h) {

		return w * h;

	}
	
	void start() {
		int idx = 0;
		Random rr = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 도형을 선택하세요(1. 삼각형, 2.직사각형, 3.정사각형, 4. 원) => ");
		idx = sc.nextInt();
		
		if(idx == 1) {
			 w = rr.nextInt(10) + 1;
			 h = rr.nextInt(10) + 1;
			System.out.printf("가로 %d, 세로 %d => 삼각형 넓이 : %.1f",w,h, triangle(w,h) );
		}
		
		if(idx == 2) {
			 w = rr.nextInt(10) + 1;
			 h = rr.nextInt(10) + 1;
			System.out.printf("가로 %d, 세로 %d => 직사각형 넓이 : %d",w,h, ractangle(w,h) );
		}
		
		if(idx == 3) {
			 r = rr.nextInt(10) + 1;
			System.out.printf("가로 %d, 세로 %d => 직사각형 넓이 : %d",r,r, squre(r) );
		}
		
		if(idx == 4) {
			 r = rr.nextInt(10) + 1;
			System.out.printf("반지름 %d -> 원 넓이 : %f",r, circle(r) );
		}
		
		
		
		
	}
}
