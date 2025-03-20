package kr.ac.kopo.day06;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"asd","qwe","zxc"};
		String[] arr2 = new String[arr.length];
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		String s = Arrays.toString(arr);
		System.out.println(s);
		
		System.arraycopy(arr,0,arr2,0,arr.length);

	}

}
