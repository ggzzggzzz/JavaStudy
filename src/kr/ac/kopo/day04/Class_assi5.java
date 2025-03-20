package kr.ac.kopo.day04;

public class Class_assi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 9; i++)
		{
			for(int j = 0; j <= i; j++ ) {
				
				if(i > 4) {
					
					continue;
				}
					
				System.out.print("*");
			}
			
			if(i > 4) {
				for(int k = 9; k > i; k--) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			
		}

	}

}
