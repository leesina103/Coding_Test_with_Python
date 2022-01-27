package Chapter11;

import java.util.Scanner;

public class MulOrPlus {
	public static int biggestNum(String str) {
		int strlen = str.length();
		int[] numarr = new int[strlen];
		int num = Integer.parseInt(str);	// 숫자로 변환한 것을 numarr배열에 한 숫자씩 넣기
		for(int i=0 ; i<strlen ; i++) {		// ex)567 -> {7, 6, 5} 순서는 상관이 없음, 어차피 연산할것이기 때문에
			numarr[i] = num % 10;
			num /= 10;
		}
		return calculate(numarr, 0, 0);
	}

	//한 숫자씩 담은 배열을 재귀호출로 돌려서 모든 경우의 수를 계산해서 제일 큰 값 찾기
	public static int calculate(int[] arr, int depth, int result) {
		if(depth == arr.length)
			return result;
		int a = calculate(arr, depth+1, result + arr[depth]);
		int b = calculate(arr, depth+1, result * arr[depth]);
		if(a < b)
			return b;
		else 
			return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "567";
//		String str2 = "02984";
//		System.out.println(calculate(arr, 0, 0));
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		System.out.println(biggestNum(str));
	}
	
//	 public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        String str = sc.next();
//
//	        // 첫 번째 문자를 숫자로 변경한 값을 대입
//	        long result = str.charAt(0) - '0';
//	        
//	        for (int i = 1; i < str.length(); i++) {
//	            // 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
//	            int num = str.charAt(i) - '0';
//	            if (num <= 1 || result <= 1) {
//	                result += num;
//	            }
//	            else {
//	                result *= num;
//	            }
//	        }
//
//	        System.out.println(result);
//	    }

}
