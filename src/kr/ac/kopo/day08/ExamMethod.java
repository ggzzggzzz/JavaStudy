package kr.ac.kopo.day08;

public class ExamMethod {

	void printSum(int i, int j) {
		
		int sum = this.getTotal(i, j);
		
		
		System.out.printf("%d - %d 사이의 총합: %d\n",i, j, sum);
		
		
	
	}
	
	int getTotal(int a, int b) {
		
		int sum = 0;
		for(int i = a; i <= b; i++)
		{
			sum += a;
		}
		
		return sum;
		
	}
}
