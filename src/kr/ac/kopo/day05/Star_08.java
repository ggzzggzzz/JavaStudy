package kr.ac.kopo.day05;
/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 */
public class Star_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 9; i++)
		{
			
			if(i < 5)
			{
				for(int j = 0; j < 4-i; j++)
					System.out.print(" ");
				for(int j = 0; j < i+1; j++)
					System.out.print("*");
			}
			else
			{
				for(int j = 0; j < i - 4; j++)
					System.out.print(" ");
				for(int j = 0; j < 9 - i; j++)
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
