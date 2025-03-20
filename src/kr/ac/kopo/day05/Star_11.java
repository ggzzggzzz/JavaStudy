package kr.ac.kopo.day05;
/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*      
*        */
public class Star_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nstar = 8;
		int nstar2 = 2;
		for(int i = 0; i < 9; i++)
		{
			if (i < 5)
			{
				for(int j = 0; j < i + 1; j++)
					System.out.print("*");
				
				for(int j = 0; j < nstar; j++)
					System.out.print(" ");
				
				for(int j = 0; j < i + 1; j++)
					System.out.print("*");
				
				nstar = nstar - 2;
			}
			else
			{
				for(int j = 0; j < 9 - i; j++)
					System.out.print("*");
				
				for(int j = 0; j < nstar2; j++)
					System.out.print(" ");
				
				for(int j = 0; j < 9 - i; j++)
					System.out.print("*");
				
				nstar2 = nstar2 + 2;
			}
			System.out.println();
			
		}
	}

}
