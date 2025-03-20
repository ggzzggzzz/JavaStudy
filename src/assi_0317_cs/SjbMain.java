package assi_0317_cs;

import java.util.Arrays;
import java.util.Random;

public class SjbMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = r.nextInt(10) + 1;
		}
		
		Arrays.sort(a);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(i + 1 + "번 째 실행 시간 = " + a[i] + "초  ");
			
			for(int j = 0; j < a[i] % 11; j ++)
			{
				System.out.print(a[i] + "  ");
			}
			
			System.out.println();
		}
		
		

	}

}
