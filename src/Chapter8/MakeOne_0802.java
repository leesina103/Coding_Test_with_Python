package Chapter8;

import java.util.*;

public class MakeOne_0802 {

	// 엄청 큰 수로 리셋하기
	public static int cache[] = new int[30001];
	public static int INF = 987654321;
	
	public static int minCal(int x) {
		// 기저 사례
		if(x == 1)
			return 0;
		// 메모이제이션 적용 안되있으면 INF, 되어있으면 다른 수
		if(cache[x] != INF)
			return cache[x];
//		if(x % 5 == 0) {
//			count = minCal(x / 5) + 1;
//			if(count < cache[x])
//				cache[x] = count; 
//		}
		// 처음에는 위 처럼 멍청한 코드를 썼는데, min함수로 해결 가능
		if(x % 5 == 0) 
			cache[x] = Math.min(cache[x], minCal(x / 5) + 1);
		if(x % 3 == 0) 
			cache[x] = Math.min(cache[x], minCal(x / 3) + 1);
		if(x % 2 == 0)
			cache[x] = Math.min(cache[x], minCal(x / 2) + 1);
		cache[x] = Math.min(cache[x], minCal(x - 1) + 1);
		return cache[x];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		Arrays.fill(cache, INF);
		System.out.println(minCal(x));
		scan.close();
	}

}
