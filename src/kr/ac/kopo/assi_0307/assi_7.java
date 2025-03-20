package kr.ac.kopo.assi_0307;

//100~1사이의 짝수를 출력하는 코드를 작성하시오. 100 98 96 94 ... 4 2

public class assi_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 101; i++)
		{
			if((i % 2) == 0)
				System.out.println(i);
		}
		
	}

}
