package assi_0318;

public class StringUtillMain {

	public static void main(String[] args) {

		StringUtil su = new StringUtil();
		
		String str = "qwewqwe";
		StringBuilder str2 = new StringBuilder();
		str2 = su.toUpperString(str);
		
		System.out.println(su.isUpperChar('A'));
		System.out.println(su.isLowerChar('a'));
		System.out.println(su.max(5, 4));
		System.out.println(su.min(5, 4));
		System.out.println(su.reverseString("!!!dlrow olleH"));
		System.out.println(su.toUpperString("hello"));
		System.out.println(su.toLowerString("HeLLO"));
		System.out.println(su.checkChar(str, 'w'));
		System.out.println(su.compareTo("asdasd", "asdasd"));
	}

}
