package kr.ac.kopo.assi_0307;

//6. 1 ~ 100사이의 홀수를 출력하는 코드를 작성하시오

public class assi_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 101; i++)
		{
			if((i % 2) == 1)
				System.out.println(i);
		}
	}

}
