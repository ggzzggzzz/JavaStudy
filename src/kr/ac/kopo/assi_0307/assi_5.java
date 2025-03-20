package kr.ac.kopo.assi_0307;

import java.util.Scanner;

/*
성적을 입력받아 학점을 출력하는 코드를 작성하시오. (if, switch 둘다 작성)
	성적 학점
-------------------
90점이상 A
80~89점 B
70~79점 C
60~69점 D
60점미만 F
성적을 입력 : 83 (키보드입력)ㅓㅘ
83점의 학점은 B
*/
public class assi_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char point = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력: ");
		int score = sc.nextInt();
		
		if(score >= 90)
			point = 'A';
		else if(score >= 80 && score <= 89)
			point = 'B';
		else if(score >= 70 && score <= 79)
			point = 'C';
		else if(score >= 60 && score <= 69)
			point = 'D';
		else
			point = 'F';
		
		System.out.printf("%d점의 학점은 %c ",score,point);
	}

}
