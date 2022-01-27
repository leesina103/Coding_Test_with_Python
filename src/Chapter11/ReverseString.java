package Chapter11;

import java.util.Scanner;

public class ReverseString {
	
	public static int reverse(String str) {
		String s1 = str.substring(0, 1);		// 0번째 index
		String s2 = "";
		int zeroCount = 0;
		int oneCount = 0;
		if(s1.equals("0"))
			zeroCount++;
		else 
			oneCount++;
		
		// 0과 1이 뒤바뀌는 타이밍이 구간이 바뀌는 시작점
		for(int i=1 ; i<str.length() ; i++) {		
			s1 = str.substring(i, i+1);
			s2 = str.substring(i-1, i);
			if(s1.equals("1") && s2.equals("0"))
				oneCount++;
			else if(s1.equals("0") && s2.equals("1"))
				zeroCount++;
		}
		
		if(zeroCount > oneCount)
			return oneCount;
		else 
			return zeroCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "0001100";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		System.out.println(reverse(str));
	}

}
