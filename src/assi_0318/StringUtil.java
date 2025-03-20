package assi_0318;

public class StringUtil {

	boolean isUpperChar(char c) {
		if (c >= 'A' && c <= 'Z')
			return true;
		else
			return false;
	}

	boolean isLowerChar(char c) {
		if (c >= 'a' && c <= 'z')
			return true;
		else
			return false;
	}

	int max(int i, int j) {
		int max = (i > j) ? i : j;
		return max;

	}
	
	int min(int i, int j) {
		int min = (i < j) ? i : j;
		return min;
	}
	
	String  reverseString( String str ) {
		String s = "";
		for(int i = str.length() - 1; i > -1; i--) {
			s += str.charAt(i);
		}
		
		return s;
	}
	
	StringBuilder toUpperString( String str ) {
		StringBuilder s = new StringBuilder();
		char c;
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(c >= 'a' && c <= 'z')
				c -= 32;
			s.append(c) ;
		}
		return s;
	}
	
	StringBuilder toLowerString( String str ) {
		StringBuilder s = new StringBuilder();
		char c;
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(c >= 'A' && c <= 'Z')
				c += 32;
			s.append(c) ;
		}
		
		
		return s;
		
	}
	
	int compareTo(String str1, String str2) {
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		if(str1.equals(str2))
			return 0;
		
		else if(str1.charAt(0) > str2.charAt(0)) 
			return 1;
		
			
		else
			return -1;
	}
	
	// 문자열의 각 내용들을 비교하여 입력 받는 char c의 값과 동일한 char 의 
	// 개수를 리턴 한다. - 대소문자 구별하여 비교한다.
	public static int checkChar(String strData, char ch) {
		int count = 0;
		int i = -1;
		int j = 0;
		
		while(j != -1) {
			i = strData.indexOf(ch,i+1);
			j = strData.indexOf(ch,i+1);
			count++;
		}
		return count;
	}
	
	public static String removeChar(String oriStr, char delChar)  {
		String s = "";
		
		return s;
	}

}
