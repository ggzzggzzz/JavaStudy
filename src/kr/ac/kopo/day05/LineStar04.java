package kr.ac.kopo.day05;

import java.util.Scanner;

public class LineStar04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Line : ");
	        int a = scanner.nextInt();
	       

	        
	        for (int i = 0; i < a; i++) {
	           
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	           
	            for (int j = 0; j < (2 * (a - i) - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	}

}
}
