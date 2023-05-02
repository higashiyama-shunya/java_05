package excerice;

import lib.Input;

public class Pass05_04 {

	public static void main(String[] args) {
		System.out.println("10文字以上で適当に入力してください");
		String str1=Input.getString();
		
		String str2,str3;
		int n=str1.length();
		str2=str1.toUpperCase();
		str3=str1.substring(0, 5);
		System.out.println(str1);
		System.out.println(n);
		System.out.println(str2);
		System.out.println(str3);
		

	}

}
