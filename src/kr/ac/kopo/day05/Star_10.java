package kr.ac.kopo.day05;


public class Star_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nstar = 7;
		for(int i = 0; i < 9; i++)
		{
			if(i < 5)
			{
				for(int j = 0; j < 4 - i; j++)
					System.out.print(" ");
				for(int j = 0; j < i * 2 + 1; j++)
					System.out.print("*");
			}
			else
			{
				for(int j = 0; j < i - 4; j++)
					System.out.print(" ");
				for(int j = 0; j < nstar; j++) {
					System.out.print("*");
					
				}
				nstar = nstar - 2;
			}
			
			
			
			System.out.println();
		}
	}

}
