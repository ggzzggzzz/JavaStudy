package kr.ac.kopo.day04;

public class Class_assi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 0;i < 9; i++)
		{
			if(i < 5) {
				for(int k = 0; k < i; k++)
					System.out.print(" ");
				
				for(int j = 5; j > i; j--)
				{
					
					System.out.print("*");
				}
			}
			
			if(i > 4) {
				for(int k = 8; k > i; k--)
					System.out.print(" ");
				
				for(int j = 3; j < i; j++)
				{
					
					System.out.print("*");
				}
				
			}
			
			
			System.out.println();
		}
	}

}
