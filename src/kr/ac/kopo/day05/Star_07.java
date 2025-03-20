package kr.ac.kopo.day05;

/*
 *****
 ****
 ***
 **
 *
 **
 ***
 ****
 *****
 */
public class Star_07 {

	public static void main(String[] args) {

		for(int i = 0; i < 9; i++)
		{
			for(int j = 0;j < 5-i; j++)
				System.out.print("*");
			if(i > 4)
				for(int j = 0; j< i - 3;j++)
					System.out.print("*");
				
			
			System.out.println();
		}
		
	}

}
