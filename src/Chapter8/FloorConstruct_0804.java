package Chapter8;

import java.util.*;

public class FloorConstruct_0804 {

	public static int cache[] = new int[1001];
	
	public static int count(int n) {
		if(n == 1)
			return 1;
		if(n == 2)
			return 3;
		if(cache[n] != 0)
			return cache[n];
		return cache[n] = (count(n-1) + count(n-2) * 2) % 796796;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(count(n));
		scan.close();
	}

}
