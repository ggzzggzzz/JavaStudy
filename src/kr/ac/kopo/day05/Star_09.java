package kr.ac.kopo.day05;
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
public class Star_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for(int i = 0; i < 5; i++)
		{
			
				for(int j = 0; j < 4 - i; j++)
					System.out.print(" ");
				for(int j = 0; j < i * 2 + 1; j++)
					System.out.print("*");
			
			
			
			
			System.out.println();
		}
	}

}
