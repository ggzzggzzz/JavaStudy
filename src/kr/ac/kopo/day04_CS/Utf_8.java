package kr.ac.kopo.day04_CS;

import java.util.Scanner;

public class Utf_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("2진수를 입력: ");
        String input = sc.nextLine();
        
        char[] a = new char[input.length()];
        
        for (int i = 0; i < input.length(); i++) {
            a[i] = input.charAt(i);
        }
        
        
        if (a[0] == '0') { // 1바이트로 표현 가능 할 때
            for (int i = 1; i < 8; i++) {
                System.out.print(a[i]);
            }
        } else if (a[0] == '1' && a[1] == '1') { 
            if (a[2] == '0') { // 2바이트 (110xxxxx 10xxxxxx)
                for (int i = 3; i < 8; i++) {
                	  System.out.print(a[i]);
                }
                for (int i = 10; i < 16; i++) {
                	  System.out.print(a[i]);
                }
            } else if (a[2] == '1' && a[3] == '0') { // 3바이트(1110xxxx 10xxxxxx 10xxxxxx)
                for (int i = 4; i < 8; i++) {
                	  System.out.print(a[i]);
                }
                for (int i = 10; i < 16; i++) {
                	  System.out.print(a[i]);
                }
                for (int i = 18; i < 24; i++) {
                	  System.out.print(a[i]);
                }
            } else if (a[3] == '1' && a[4] == '0') { // 4바이트(11110xxx 10xxxxxx 10xxxxxx 10xxxxxx)
                for (int i = 5; i < 8; i++) {
                	  System.out.print(a[i]);
                }
                for (int i = 10; i < 16; i++) {
                	  System.out.print(a[i]);
                }
                for (int i = 18; i < 24; i++) {
                	  System.out.print(a[i]);
                }
                for (int i = 26; i < 32; i++) {
                	  System.out.print(a[i]);
                }
            }
        }
        
        
        
        sc.close();
    }
}
